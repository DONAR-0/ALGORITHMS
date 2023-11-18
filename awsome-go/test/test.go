package main

import (
	"fmt"

	awsomego "awsome.io/algos"
)

func main() {
	sc01 := awsomego.NewSenario_01[string]()
	sc01.Add("G")
	sc01.Add("p")
	sc01.Add("b")
	sc01.Add("G")
	fmt.Println(sc01.Size)
	fmt.Print(sc01.Get(0))
	sc02 := awsomego.NewLinkedList()
	sc02.Append(00)
	sc02.Append(02)
	sc02.Append(03)
	sc02.Append(04)
	sc02.Append(05)
	sc02.Display()

	matrix := make([][]int, 4)
	awsomego.PrintMatrix(matrix)
}
