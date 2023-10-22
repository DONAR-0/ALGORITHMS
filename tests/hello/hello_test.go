package hello_test

import (
	"testing"

	"github.com/DONAR-0/ALGORITHMS/tests/hello"
)

func TestHello(t *testing.T) {
	got := hello.Hello("Chris", "")
	want := "Hello, Chris"
	assertCorrectMessage(t, got, want)
}

func assertCorrectMessage(t testing.TB, got, want string) {
	t.Helper()
	if got != want {
		t.Errorf("Asserting correct message,got %v , want %v", got, want)
	}
}

// TODO: createTable function
func createTable(t testing.TB, got, want string) {
	table := `
+---------+---------+
|   got   |  want   |
+---------+---------+
| %v | %v |
+---------+---------+
`
	if got != want {
		t.Errorf(table, got, want)
	}
}
