package version1;

class CheckingAccount extends BankAccount {

    private double overdaft;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void addTransaction(double amount, String date) {
        super.addTransactionCount();
        Transaction t = new Transaction(super.getTransactionCount(), amount, date);
        addTransactionArray(t);
        if (t.getAmount() < 0) {
            if (Math.abs(t.getAmount()) > balance) {
                overdaft += Math.abs(t.getAmount()) - balance;
                balance = 0;
            } else {
                balance += t.getAmount();
            }
        } else {
            double temp = t.getAmount();
            if (overdaft > 0) {
                if (temp <= overdaft) {
                    overdaft -= temp;
                    temp -= overdaft;
                } else {
                    temp -= overdaft;
                    overdaft = 0;
                }
            }
            if (temp > 0) {
                balance += temp;
            }
        }
    }

    @Override
    public String toString() {
        return "{" + " accNumber='" + getAccNumber() + "'" + ", balance='" + balance + "'" + ", Overdaft='" + overdaft
                + "'" + ", TransactionCount='" + getTransactionCount() + "'" + "}";
    }

}