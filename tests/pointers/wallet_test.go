package wallet_test

import (
	"testing"

	wal "github.com/DONAR-0/ALGORITHMS/tests/pointers"
)

func TestWallet(t *testing.T) {
	wallet := wal.Wallet{}
	wallet.Deposit(10)
	got := wallet.Balance()
	want := wal.Bitcoin(10)
	assertBalance(t, got, want)
}

func assertBalance(t testing.TB, got, want wal.Bitcoin) {
	t.Helper()
	if got != want {
		t.Errorf("got %d want %d", got, want)
	}
}