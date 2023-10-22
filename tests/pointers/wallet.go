package wallet

import "fmt"

type (
	Bitcoin int
	Wallet  struct {
		BalanceAmount Bitcoin
	}
)

func (w *Wallet) Deposit(amount Bitcoin) {
	fmt.Printf("address of balance in Deposit is %v \n", &w.BalanceAmount)
	w.BalanceAmount += amount
}

func (w *Wallet) Balance() Bitcoin {
	return w.BalanceAmount
}

func (w *Wallet) WithDraw(amount Bitcoin) {
	w.BalanceAmount -= amount
}

func (b Bitcoin) String() string {
	return fmt.Sprintf("%d BTC", b)
}
