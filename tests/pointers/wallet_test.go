package wallet_test

import (
	"testing"

	wal "github.com/DONAR-0/ALGORITHMS/tests/pointers"
)

func TestWallet(t *testing.T) {
	assertBalance := func(t testing.TB, got, want string) {
		t.Helper()
		if got != want {
			t.Errorf("got %s want %s", got, want)
		}
	}

	t.Run("deposit", func(t *testing.T) {
		wallet := wal.Wallet{}
		wallet.Deposit(10)
		got := wallet.Balance()
		want := wal.Bitcoin(10)
		assertBalance(t, got.String(), want.String())
	})

	t.Run("withdraw", func(t *testing.T) {
		wallet := wal.Wallet{BalanceAmount: wal.Bitcoin(20)}
		wallet.WithDraw(wal.Bitcoin(10))
		got := wallet.Balance()
		want := wal.Bitcoin(10)
		assertBalance(t, got.String(), want.String())
	})
}
