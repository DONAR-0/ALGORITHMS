package awsomego

type (
	Setter[T any]      func(*Scenario_01[T])
	Scenario_01[T any] struct {
		DEFAULT_CAPACITY, capacity, Size int16
		objects                          []T
	}
	Node struct {
		data int
		next *Node
	}
	Scenario_02 struct {
		head *Node
	}
)
