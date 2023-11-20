package main

import (
	"fmt"
	"time"
)

func main() {
	started := time.Now()
	foods := []string{"mashroom pizza", "pasta", "kebab", "cake"}
	results := make(chan bool)
	// send data to channel results <-true
	// receive data from channel var some := <-results
	// this is a fixed size=1(make functions is 1) means only value can be send at one time
	// <-results go into deadlock
	// Giving all values= size from make to go routine will exit the code
	// results <- true
	// results <- false
	// results <- false
	for _, f := range foods {
		go func(f string) {
			cook(f)
			results <- true
		}(f)
	}
	for i := 0; i < len(foods); i++ {
		<-results
	}
	fmt.Printf("done in %v\n", time.Since(started))
}

func cook(food string) {
	fmt.Printf("cooking %s...\n", food)
	time.Sleep(2 * time.Second)
	fmt.Printf("done cooking %s \n", food)
	fmt.Println()
}
