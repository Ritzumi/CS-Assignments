package version1;

public class BankDriver{
    //Access BankOperation's Methods only.
    public static void main(String[] args) {
        BankCustomer jane = new BankCustomer("Jane", "01121975");
        System.out.println("-----------------------------------------");
        BankCustomer annie = new BankCustomer("Ann", "20021976", 2000);
        System.out.println("-----------------------------------------");
        BankCustomer elon = new BankCustomer("Elon", "28061971", 54000000000.0, 10);
        System.out.println("-----------------------------------------");
        BankOperation.addAccount(jane);
        System.out.println("-----------------------------------------");
        BankOperation.addBalance(jane, 1, 1000);
        System.out.println("-----------------------------------------");
        BankOperation.getBalanceList(elon);
        System.out.println("-----------------------------------------");
        System.out.println(elon.getAcc().get(0).stringId());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

    }
}