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
	buf := make([]byte, 5)
	for {
		n, err := conn.Read(buf)
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

func stringReader() {
	s := strings.NewReader("very short but interesting string")
	buf := make([]byte, 1)
	for {
		n, err := s.Read(buf)
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

func fileReader() {
	f, err := os.Open("./small.txt")
	if err != nil {
		panic(err)
	}
	defer f.Close()
	buf := make([]byte, 3)
	for {
		n, err := f.Read(buf)
		if err == io.EOF {
			break
		}
		if err != nil {
			fmt.Println(err)
			break
		}
		if n > 0 {
			fmt.Println(string(buf[:n]))
			// fmt.Println(buf)
		}
	}
}
