package version2;

class CheckingAccount extends BankAccount {
    private double overdaft;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void transfer(double amount, String date) {
        if (amount == 0) {
            System.out.println("Really?");
            return;
        }
        if (amount < 0) {
            if (Math.abs(amount) > getBalance()) {
                double temp = Math.abs(amount);
                temp -= getBalance();
                overdaft += temp;
                setBalance(0);
                addTransactionCount();
                addTransactionArray(new Transaction(amount, date, getTransactionCount()));
                System.out.println(
                        "Transfer complete! Your current amount is: " + getBalance() + " Overdaft: " + overdaft);
            } else {
                setBalance(getBalance() + amount);
                addTransactionCount();
                addTransactionArray(new Transaction(amount, date, getTransactionCount()));
                System.out.println(
                    "Transfer complete! Your current amount is: " + getBalance() + " Overdaft: " + overdaft);
            }
        } else {
            double temp = Math.abs(amount);
            if (overdaft > 0) {
                if (temp > overdaft) {
                    temp -= overdaft;
                    overdaft = 0;
                } else {
                    overdaft -= temp;
                    temp = 0;
                }
            }
            if (temp > 0) {
                setBalance(getBalance() + temp);
                addTransactionCount();
                addTransactionArray(new Transaction(amount, date, getTransactionCount()));
                System.out.println(
                    "Transfer complete! Your current amount is: " + getBalance() + " Overdaft: " + overdaft);
            }
        }
    }

    public String toString() {
        return "Account number = " + getAccNumber() + " Balance = " + getBalance() + " Overdaft = " + overdaft;
    }

}