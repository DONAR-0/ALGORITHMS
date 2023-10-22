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

	assertError := func(t testing.TB, got, want error) {
		t.Helper()
		if got == nil {
			t.Fatal("wanted an error but didn't get one")
		}
		if got != want {
			t.Errorf("got %q,want %q", got, want)
		}
	}

	assertNoError := func(t testing.TB, err error) {
		if err == nil {
			t.Fatal("wanted an error but didn't get one")
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
		err := wallet.WithDraw(wal.Bitcoin(10))
		got := wallet.Balance()
		want := wal.Bitcoin(10)
		assertNoError(t, err)
		assertBalance(t, got.String(), want.String())
	})

	t.Run("withdraw insufficent funds", func(t *testing.T) {
		startingBalance := wal.Bitcoin(20)
		wallet := wal.Wallet{startingBalance}
		err := wallet.WithDraw(wal.Bitcoin(100))
		assertError(t, err, wal.ErrInsufficientFunds)
		assertBalance(t, wallet.Balance().String(), startingBalance.String())
	})
}
