package version1;

import java.util.ArrayList;

class BankCustomer {
    private ArrayList<SavingAccount> acc = new ArrayList<>();
    private String name;
    private String birthday;

    BankCustomer(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    BankCustomer(String name, String birthday, double balance) {
        this.name = name;
        this.birthday = birthday;
        BankOperation.addAccount(this, balance);
    }
    BankCustomer(String name, String birthday, double balance, double interest) {
        this.name = name;
        this.birthday = birthday;
        BankOperation.addAccount(this, balance, interest);
    }
/*
    public void addAccount() {
        acc.add(new SavingAccount(name));
    }

    public void addAccount(double balance) {
        acc.add(new SavingAccount(name, balance));
    }

    public void addAccount(double balance, double interest) {
        acc.add(new SavingAccount(name, balance, interest));
    }
    
*/
    public String getName() {
        return name;
    }

    public ArrayList<SavingAccount> getAcc() {
        return acc;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setAcc(ArrayList<SavingAccount> acc) {
        this.acc = acc;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

}