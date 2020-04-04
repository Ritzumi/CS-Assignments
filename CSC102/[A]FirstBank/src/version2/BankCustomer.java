package version2;

import java.util.HashMap;

class BankCustomer {
    private HashMap<String, SavingAccount> acc = new HashMap<>();
    private String name;
    private String birthday;

    BankCustomer(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public HashMap<String, SavingAccount> getAcc() {
        return acc;
    }
    public int getAccountCount(){
        return acc.size();
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public ArrayList<SavingAccount> getAcc() {
        return acc;
    }

    public void setAcc(ArrayList<SavingAccount> acc) {
        this.acc = acc;
    }
*/

}