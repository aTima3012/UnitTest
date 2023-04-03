package Accounts;

public class SavingsAccount extends Account {
    protected long balanceMin;

    public SavingsAccount(String name, long balance, long balanceMin) {
        super(name, balance);
        this.balanceMin = balanceMin;
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) < balanceMin) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}