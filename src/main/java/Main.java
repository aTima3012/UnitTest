
import Accounts.Account;
import Accounts.CheckingAccount;
import Accounts.CreditAccount;
import Accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("Света", 10000, 500);
        CheckingAccount account2 = new CheckingAccount("Настя", 1200000);
        CreditAccount account3 = new CreditAccount("Себастьян", -1300000);
        System.out.println("\nОстаток по накопительному счету:");
        print(account1);
        System.out.println("\nОстаток по расчетному счету:");
        print(account2);
        System.out.println("\nОстаток по кредитному счету:");
        print(account3);
    }

    public static void print(Account account) {
        System.out.println(account);

        System.out.print("Попытка пополнения счета на 100000");
        System.out.println(account.add(100000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 100000");
        System.out.println(account.pay(100000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 25000");
        System.out.println(account.pay(25000) ? " - ок" : " - неудача");
    }
}