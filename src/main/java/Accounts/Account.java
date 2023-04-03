package Accounts;

public class Account {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        balance = balance - amount;
        return true;
    }

    public boolean add(long amount) {
        balance = balance + amount;
        return true;
    }

    public String toString() {
        return "Владелец " + name + " Баланс " + balance;
    }
}