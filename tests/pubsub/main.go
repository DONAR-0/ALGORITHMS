package main

import (
	"fmt"
	"sync"
)

type PubSub[T any] struct {
	subscribers []chan T
	mu          sync.RWMutex
	closed      bool
}

func NewPubSub[T any]() *PubSub[T] {
	return &PubSub[T]{
		mu: sync.RWMutex{},
	}
}

func (s *PubSub[T]) Subscribe() <-chan T {
	s.mu.Lock()
	defer s.mu.Unlock()
	if s.closed {
		return nil
	}
	r := make(chan T)
	s.subscribers = append(s.subscribers, r)
	return r
}

func (s *PubSub[T]) Publish(value T) {
	s.mu.RLock()
	defer s.mu.RUnlock()
	if s.closed {
		return
	}
	for _, ch := range s.subscribers {
		ch <- value
	}
}

func (s *PubSub[T]) Close() {
	s.mu.Lock()
	defer s.mu.Unlock()
	if s.closed {
		return
	}
	for _, ch := range s.subscribers {
		close(ch)
	}
	s.closed = true
}

func main() {
	fmt.Println("vim-go")
	ps := NewPubSub[string]()
	wg := sync.WaitGroup{}

	s1 := ps.Subscribe()
	// -
	go func() {
		wg.Add(1)
		for {
			select {
			case val, ok := <-s1:
				if !ok {
					fmt.Println("sub 1, exiting")
					wg.Done()
					return
				}
				fmt.Println("sub 1,value", val)
			}
		}
	}()
	s2 := ps.Subscribe()
	// -
	go func() {
		wg.Add(1)
		for {
			select {
			case val, ok := <-s2:
				if !ok {
					fmt.Println("sub 2, exiting")
					wg.Done()
					return
				}
				fmt.Println("sub 2,value", val)
			}
		}
	}()

	// -
	ps.Publish("one")
	ps.Publish("two")
	ps.Publish("three")

	ps.Close()

	wg.Wait()
	fmt.Println("completed")
}
