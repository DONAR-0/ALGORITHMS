package main

import (
	"context"
	"fmt"
	"math/rand"
	"os"
	"os/signal"
	"syscall"
	"time"
)

const (
	minLatency = 10
	maxLatency = 5000
	timeOut    = 3000
)

// context is useful signal propagation
// ctx, cancel := context.WithTimeout()
func main() {
	// Little program that searches flights routes
	// we are going to use a mock backend/database

	// the process of this is to show how the context  can be used to propogate cancellation signals across
	// differently go routines / "processes" (abstract processes)
	rootContext := context.Background() // never gets cancelled

	fmt.Println("starting to search for nyc-london")
	// ctx, cancel := context.WithTimeout(context.Background(), time.Duration(timeOut)*time.Millisecond)
	ctxWithTimeOut, cancel := context.WithTimeout(rootContext, time.Duration(timeOut)*time.Millisecond)
	defer cancel()

	// listen for interrupt signal
	sig := make(chan os.Signal)
	signal.Notify(sig, os.Interrupt, syscall.SIGTERM)
	go func() {
		<-sig
		//Now Cancel
		fmt.Println("aborting due to interrupt")
		cancel()
		os.Exit(0)
	}()
	res, err := Search(ctxWithTimeOut, "nyc", "london")
	if err != nil {
		fmt.Printf("got error: %s", err)
	}
	if len(res) != 0 {
		fmt.Println("got results: ", res)
	}
}

func Search(kontext context.Context, from, to string) ([]string, error) {
	//slowsearch
	// we need to watch when ctx.Done is closed
	res := make(chan []string)
	go func() {
		res <- slowsearch(from, to)
		close(res)
	}()

	// wait for 2 events: either of one will be the result
	for {
		select {
		case dst := <-res:
			return dst, nil
		case <-kontext.Done():
			return []string{}, kontext.Err()
		}
	}
}

// Search is very slow function that goes throguh series of operations and returns a slice of strings
func slowsearch(from, to string) []string {
	// sleep for random period between 10 and 5000 ms
	rand.Seed(time.Now().Unix())
	latency := rand.Intn(maxLatency-minLatency+1) - minLatency
	fmt.Printf("started to search for %s - %s takes %dms...\n", from, to, latency)
	time.Sleep(time.Duration(latency) * time.Millisecond)

	return []string{from + "-" + to + "-british airways-11am", from + "-" + to + "-delta airlines - 12am"}
}
