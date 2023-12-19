package main

import (
	"fmt"
	"io"
	"net"
	"os"
	"strings"
)

func main() {
	fileReader()
	stringReader()
	connReader()
}

func connReader() {
	conn, err := net.Dial("tcp", "google.com:80")
	if err != nil {
		panic(err)
	}
	defer conn.Close()
	fmt.Fprintf(conn, "Get Http 1.0\r\n\r\n")
	readerToStdout(conn, 5)
}

func stringReader() {
	s := strings.NewReader("very short but interesting string")
	readerToStdout(s, 1)
}

func fileReader() {
	f, err := os.Open("./small.txt")
	if err != nil {
		panic(err)
	}
	defer f.Close()
	readerToStdout(f, 3)
}

// Refactor code to support good point

func readerToStdout(r io.Reader, bufsize int) {
	buf := make([]byte, bufsize)
	for {
		n, err := r.Read(buf)
		if err == io.EOF {
			break
		}
		if err != nil {
			fmt.Println(err)
			break
		}
		if n > 0 {
			fmt.Println(string(buf[:n]))
		}
	}

}
