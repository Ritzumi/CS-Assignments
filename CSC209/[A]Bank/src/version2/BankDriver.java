package version2;

public class BankDriver{

    public static void main(String[] args) {
        SavingAccount b1 = new SavingAccount(5000, 1.1);
        CheckingAccount b2 = new CheckingAccount(2500);
        b1.transfer(-1000, "20/12/20");
        b1.transfer(-10000, "20/12/20");
        b1.applyInterest();
        b1.transfer(0, "20/12/20");
        b2.transfer(-1000, "20/12/20");
        b2.transfer(-10000, "20/12/20");
        b2.transfer(9000, "20/12/20");
        b1.TransactionHistory();
        b2.TransactionHistory();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}