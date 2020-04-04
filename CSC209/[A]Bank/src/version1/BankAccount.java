package version1;

abstract class BankAccount {
    private String accNumber;
    protected double balance;
    private Transaction transactions[];
    private int TransactionCount;
    private static int bankId;

    public BankAccount(double balance) {
        this.balance = balance;
        transactions = new Transaction[100];
        bankId++;
        this.accNumber = genId(bankId);
    }

    public void TransactionHistory() {
        System.out.println("Total Transactions: " + TransactionCount);
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                System.out.println(transaction.toString());
            }
        }
    }

    public int getTransactionCount() {
        return this.TransactionCount;
    }

    public void addTransactionCount() {
        TransactionCount++;
    }

    public void removeTransactionCount() {
        TransactionCount--;
    }

    public String getAccNumber() {
        return this.accNumber;
    }

    public String toString() {
        return "{" + " accNumber='" + getAccNumber() + "'" + ", balance='" + balance + "'" + ", TransactionCount='"
                + getTransactionCount() + "'" + "}";
    }

    public abstract void addTransaction(double amount, String date);

    protected void addTransactionArray(Transaction t) {
        if (getTransactionCount() >= 100) {
            for (int i = 98; i >= 0; i--) {
                transactions[i + 1] = transactions[i];
            }
            transactions[0] = null;
        }
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == null) {
                transactions[i] = t;
                break;
            }
        }
    }

    private String genId(int id) {
        String newId = String.valueOf(id);
        int length = newId.length();
        while (length < 9) {
            newId = "0" + newId;
            length = newId.length();
        }
        return newId;
    }

}