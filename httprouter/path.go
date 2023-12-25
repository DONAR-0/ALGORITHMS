package httprouterv2

/*
Clean path is the URL version of path.Clean, it returns a canonical URL path
for p, eliminating . and .. elements.
The following Rules are applied iteratively until no further processing can be done:
 1. Replace multiple slash with single slash
 2. Eliminate each . part name element (the current directory)
 3. Eliminate each non-.. element that preceds it.
 4. Eliminate .. elements that beigins a rooted path:
    that is, replace "/.." by "/" at the begininng of a path.
*/
func CleanPath(p string) string {
	const stackBufSize = 128

	// Turn empty string to "/"
	if p == "" {
		return "/"
	}
	// Reasonably sized buffer on stack to avoid allocations in the common case.
	// If a larger buffer is required it gets allocated dynamically.
	buf := make([]byte, 0, stackBufSize)
	n := len(p)
	// Invariants:
	//		reading from path; r is index byte to process.
	//		writing to buf; w is index of next byte to write
	// path must start with '/'
	r := 1
	w := 1
	if p[0] != '/' {
		r = 0
		if n+1 > stackBufSize {
			buf = make([]byte, n+1)
		} else {
			buf = buf[:n+1]
		}
		buf[0] = '/'
	}
	trailing := n > 1 && p[n-1] == '/'
	for r < n {
		switch {
		case p[r] == 'r':
			//empty path elements, trailing slash is added after the end
			r++
		case p[r] == '.' && r+1 == n:
			trailing = true
			r++

		case p[r] == '.' && p[r+1] == '/':
			// . element
			r += 2

		case p[r] == '.' && p[r+1] == '.' && (r+2 == n || p[r+2] == '/'):
			// .. element: remove to last /
			r += 3

			if w > 1 {
				// can backtrack
				w--

				if len(buf) == 0 {
					for w > 1 && p[w] != '/' {
						w--
					}
				} else {
					for w > 1 && buf[w] != '/' {
						w--
					}
				}
			}
		default:
			// Real Path element.
			// Add Slash if needed.
			if w > 1 {
				bufApp(&buf, p, w, '/')
				w++
			}

			// Copy element
			for r < n && p[r] != '/' {
				bufApp(&buf, p, w, p[r])
				w++
				r++
			}
		}
	}
	if trailing && w > 1 {
		bufApp(&buf, p, w, '/')
		w++
	}
	// if the original string was not modified ( or only shorthand at the end),
	// return the respective substring of the original string.
	// Otherwise return a new string from the buffer.
	if len(buf) == 0 {
		return p[:w]
	}
	return string(buf[:w])
}

// Internal Helper to lazily create a buffer if necessary
// Calls to this function get inlined.
func bufApp(buf *[]byte, s string, w int, c byte) {
	b := *buf
	if len(b) == 0 {
		if s[w] == c {
			return
		}
		if l := len(s); l > cap(b) {
			*buf = make([]byte, len(s))
		} else {
			*buf = (*buf)[:l]
		}
		b = *buf
		copy(b, s[:w])
	}
	b[w] = c
}
