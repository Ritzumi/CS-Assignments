package version2;

class SavingAccount extends BankAccount {
    private double interest;

    public SavingAccount(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    public String toString() {
        return "Account number = " + getAccNumber() + " Balance = " + getBalance() + " Interest = " + interest;
    }

    public void applyInterest(){
        setBalance(getBalance() *interest);
    }

}