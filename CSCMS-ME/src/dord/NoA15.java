package dord;

import java.util.ArrayList;

public class NoA15 {
    public static void main(String[] args) {
        // DO NOT MODIFY!!
        // Create SavingAccounts
        SavingAccount s1 = new SavingAccount(3000);
        SavingAccount s2 = new SavingAccount(1000);
        SavingAccount s3 = new SavingAccount(2000);

        // Create 1st Customer
        BankCustomer b1 = new BankCustomer("Tutor", 15);
        b1.AddAccout(s1);
        s1.withdraw(200);
        s1.deposit(500);
        b1.AddAccout(s2);
        System.out.println(b1.getName());
        System.out.println(b1.getTotalBalance());
        b1.AddAccout(s3);
        System.out.println(b1.getTotalBalance());
        s1.withdraw(200);
        s1.deposit(500);

        // Create 2nd Customer
        BankCustomer b2 = new BankCustomer("Boy", 15);
        System.out.println(b2.getName());
        System.out.println(b2.getTotalBalance());
        b2.AddAccout(s1);
        s2.deposit(5000);
        s2.withdraw(200);
        b2.AddAccout(s2);
        System.out.println(b2.getTotalBalance());
    }
}

class BankCustomer extends Customer {
    // Write you code here
    private ArrayList<SavingAccount> acc;

    BankCustomer(String name, int age){
        super(name,age);
        acc = new ArrayList<>();
    }
    public void AddAccout(SavingAccount a){
        acc.add(a);
    }
    public double getTotalBalance(){
        double sum = 0;
        for (SavingAccount a : acc) {
            sum += a.getBalance();
        }
        return sum;
    }


}

class Customer {
    // Write you code here
    private int age;
    private String name;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class SavingAccount {
    // Write you code here
    private double balance;

    SavingAccount() {
        this(0);
    }

    SavingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double balance){
        this.balance -= balance;
    }
}