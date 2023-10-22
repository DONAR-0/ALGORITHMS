package stmein

import "math"

type (
	Shape interface {
		Area() float64
		Perimeter() float64
	}
	Rectangle struct {
		Width  float64
		Height float64
	}
	Circle struct {
		Radius float64
	}
	Triangle struct {
		Base    float64
		Height  float64
		sideOne float64
		sideTwo float64
	}
)

func (reactangle Rectangle) Perimeter() float64 {
	return 2 * (reactangle.Width + reactangle.Height)
}

func (rectangle Rectangle) Area() float64 {
	return rectangle.Width * rectangle.Height
}

func (circle Circle) Perimeter() float64 {
	return 2 * math.Pi * circle.Radius
}

func (circle Circle) Area() float64 {
	return math.Pi * circle.Radius * circle.Radius
}

func (t Triangle) Area() float64 {
	return (t.Base * t.Height) * 0.5
}

func (t Triangle) Perimeter() float64 {
	return t.sideOne + t.sideTwo + t.Base
}
