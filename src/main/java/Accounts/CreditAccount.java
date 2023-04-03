package Accounts;

public class CreditAccount extends Account {

    public CreditAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean add(long amount) {
        if ((balance + amount) > 0) {
            return false;
        } else {
            balance = balance + amount;
            return true;
        }
    }
}