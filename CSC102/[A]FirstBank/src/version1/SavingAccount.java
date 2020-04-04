package version1;

class SavingAccount {
    private int id;
    private String name;
    private double balance;
    private double interest;
    private static int accId = 1;

    SavingAccount(String name) {
        this(name, 0, 0);
    }

    SavingAccount(String name, double balance) {
        this(name, balance, 0);
    }

    SavingAccount(String name, double balance, double interest) {
        this.balance = balance;
        this.id = accId;
        this.interest = interest;
        this.name = name;
        accId++;
    }

    public void addInterest() {
        balance += balance*interest;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public double getInterest() {
        return interest;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String stringId() {
        int i = 1;
        int temp = id;
        while (temp / 10 >= 1) {
            temp = temp / 10;
            i++;
        }
        String out = "";
        for (int j = 5; j >= i; j--) {
            out += "0";
        }
        return out + id;
    }
}