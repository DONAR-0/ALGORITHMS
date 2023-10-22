package stmein_test

import (
	"testing"

	"github.com/DONAR-0/ALGORITHMS/tests/stmein"
)

func TestArea(t *testing.T) {
	areaTests := []struct {
		shape stmein.Shape
		want  float64
	}{
		{stmein.Rectangle{12, 6}, 72.0},
		{stmein.Circle{10}, 314.1592653589793},
		{stmein.Triangle{Base: 12, Height: 6}, 36},
	}

	for _, tt := range areaTests {
		got := tt.shape.Area()
		assertValue(t, got, tt.want)
	}

}

func assertValue(t testing.TB, got, want float64) {
	t.Helper()
	if got != want {
		t.Errorf("got %.2f want %.2f", got, want)
	}
}
