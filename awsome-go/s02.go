package awsomego

import "fmt"

// Constructor of linked list
func NewLinkedList() *Scenario_02 {
	return &Scenario_02{}
}

// Append data to the linked list
// insertion Big o complexity is O(n)
func (ll *Scenario_02) Append(data int) {
	newNode := &Node{data: data, next: nil}
	if ll.head == nil {
		ll.head = newNode
		return
	}
	current := ll.head
	for current.next != nil {
		current = current.next
	}
	current.next = newNode
}

func (ll *Scenario_02) Display() {
	current := ll.head
	for current != nil {
		fmt.Printf("%d -> ", current.data)
		current = current.next
	}
	fmt.Println("nil")
}
