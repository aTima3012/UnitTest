package Accounts;

public class CheckingAccount extends Account {
    protected long balanceMin = 0;

    public CheckingAccount(String name, long balance) {
        super(name, balance);
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