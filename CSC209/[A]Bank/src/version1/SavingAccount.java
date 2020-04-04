package version1;

class SavingAccount extends BankAccount {

    private double interest;

    public SavingAccount(double balance, double interest) {
        super(balance);
        this.interest = interest;
    }

    @Override
    public void addTransaction(double amount, String date) {
        super.addTransactionCount();
        Transaction t = new Transaction(getTransactionCount(), amount, date);
        if(t.getAmount() < 0){
            if(Math.abs(t.getAmount()) > balance){
                System.out.println("You don't have sufficient money!");
                super.removeTransactionCount();
                return;
            } else {
                super.addTransactionArray(t);
                balance += t.getAmount();
            }
        } else {
            super.addTransactionArray(t);
            balance += t.getAmount();
        }

    }

    public void applyInterest(){
        balance *= interest;
    }

}