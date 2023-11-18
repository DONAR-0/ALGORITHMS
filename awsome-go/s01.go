package awsomego

func NewSenario_01[T any](setters ...Setter[T]) *Scenario_01[T] {
	s := &Scenario_01[T]{DEFAULT_CAPACITY: 16, Size: 0}
	for _, o := range setters {
		o(s)
	}
	return s
}

func SetSize[T any](size int16) Setter[T] {
	return func(s *Scenario_01[T]) {
		s.Size = size
	}
}

func (s *Scenario_01[T]) Add(element T) {
	s.objects = append(s.objects, element)
	s.Size++
}

func (s *Scenario_01[T]) Put(index int, element T) {
	s.objects[index] = element
}

func (s *Scenario_01[T]) Get(index int) T {
	return s.objects[index]
}
