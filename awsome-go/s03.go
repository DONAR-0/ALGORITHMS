package awsomego

import "fmt"

func FindValueInSortedMatrixOneLoop(matrix [][]int, lenght int, value int) bool {
	i, j := 0, lenght-1
	for i < lenght && j >= 0 {
		if matrix[i][j] == value {
			fmt.Printf("Element is found at i = %d and j = %d", i, j)
			return true
		}
		if matrix[i][j] > value {
			j--
		} else {
			i++
		}
	}
	return false
}

func PrintMatrix(matrix [][]int) {
	for i := range matrix {
		for j := range matrix[i] {
			if matrix[i][j] == 0 {
				fmt.Print("I am here ")
				fmt.Print(0, "->")
			} else {
				fmt.Println(matrix[i][j], "->")
			}
		}
		fmt.Println()
	}
}
