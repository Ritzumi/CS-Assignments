package version2;

abstract class BankAccount {
    private String accNumber;
    private double balance;
    private Transaction transactions[];
    private int TransactionCount;
    private static int bankId;

    public BankAccount(double balance) {
        this.balance = balance;
        transactions = new Transaction[100];
        bankId++;
        accNumber = genId(bankId);
    }

    public void transfer(double amount, String date) {
        if (amount == 0) {
            System.out.println("Really?");
            return;
        }
        if (amount < 0) {
            if (Math.abs(amount) > balance) {
                System.out.println("Error: No withdraw more than max balance");
                return;
            } else {
                balance += amount;
                TransactionCount++;
                addTransactionArray(new Transaction(amount, date, TransactionCount));
                System.out.println("Transfer complete! Your current amount is: " + balance);
            }
        } else {
            balance += amount;
            TransactionCount++;
            addTransactionArray(new Transaction(amount, date, TransactionCount));
            System.out.println("Transfer complete! Your current amount is: " + balance);
        }
    }

    public String toString() {
        return "Account number = " + getAccNumber() + " Balance = " + balance;
    }

    protected void addTransactionArray(Transaction t) {
        if (TransactionCount >= 100) {
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

    public void TransactionHistory() {
        System.out.println("Total Transactions: " + TransactionCount);
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                System.out.println(transaction.toString());
            } else {
                break;
            }
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccNumber() {
        return accNumber.substring(0, 3) + "-" + accNumber.substring(3, 6) + "-" + accNumber.substring(6, 9);
    }

    public int getTransactionCount() {
        return this.TransactionCount;
    }

    public void addTransactionCount() {
        TransactionCount++;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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