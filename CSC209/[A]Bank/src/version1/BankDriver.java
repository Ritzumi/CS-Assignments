package version1;

public class BankDriver{
    public static void main(String[] args) {
        CheckingAccount b1 = new CheckingAccount(500);
        SavingAccount b2 = new SavingAccount(2500, 1.5);
        b1.addTransaction(-1250, "06/11/45");
        b1.addTransaction(-1250, "06/11/45");
        b1.addTransaction(-1250, "06/11/45");
        b1.addTransaction(-1250, "06/11/45");
        b1.addTransaction(-1250, "06/11/45");
        b1.addTransaction(3000, "06/11/45");
        b1.addTransaction(3000, "06/11/45");
        b1.addTransaction(3000, "06/11/45");
        b1.addTransaction(3000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        b2.addTransaction(-1000, "06/11/45");
        System.out.println(b1.balance);
        System.out.println(b2.balance);
        b1.TransactionHistory();
        b2.TransactionHistory();
        System.out.println();
        System.out.println(b1.toString());
        System.out.println(b2.toString());

    }
}