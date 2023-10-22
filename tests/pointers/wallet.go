package wallet

import (
	"errors"
	"fmt"
)

type (
	Bitcoin int
	Wallet  struct {
		BalanceAmount Bitcoin
	}
)

var (
	ErrInsufficientFunds = errors.New("cannot withdraw, insufficient funds")
)

func (w *Wallet) Deposit(amount Bitcoin) {
	w.BalanceAmount += amount
}

func (w *Wallet) Balance() Bitcoin {
	return w.BalanceAmount
}

func (w *Wallet) WithDraw(amount Bitcoin) error {
	if amount > w.BalanceAmount {
		return ErrInsufficientFunds
	}
	w.BalanceAmount -= amount
	return nil
}

func (b Bitcoin) String() string {
	return fmt.Sprintf("%d BTC", b)
}
