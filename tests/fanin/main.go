package main

import (
	"encoding/csv"
	"fmt"
	"io"
	"os"
	"sync"
)

func main() {
}

func merge2(cs ...<-chan []string) <-chan []string {
	chans := len(cs)
	wait := make(chan struct{}, chans)
	return nil
}

func merge1(cs ...<-chan []string) <-chan []string {
	var wg sync.WaitGroup
	out := make(chan []string)
	send := func(c <-chan []string) {
		for n := range c {
			out <- n
		}
		wg.Done()
	}
	wg.Add(len(cs))
	for _, c := range cs {
		go send(c)
	}
	go func() {
		wg.Wait()
		close(out)
	}()
	return out
}

func read(file string) (<-chan []string, error) {
	f, err := os.Open(file)
	if err != nil {
		return nil, fmt.Errorf("opening file %v", err)
	}
	ch := make(chan []string)
	cr := csv.NewReader(f)
	go func() {
		for {
			record, err := cr.Read()
			if err == io.EOF {
				close(ch)
				return
			}
			ch <- record
		}
	}()
	return ch, nil
}
