package com.day4.schoolmanagementsystem;

interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void showBalance();
}

class BankAccount implements AccountOperations {
    private String accountHolder;
    private String ifscCode = "SBIN0001234"; // sample IFSC
    private double balance;

    public BankAccount(String holder) {
        this.accountHolder = holder;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("⚠️ Insufficient balance.");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("👤 Account Holder: " + accountHolder);
        System.out.println("🏦 IFSC Code: " + ifscCode);
        System.out.println("💰 Current Balance: ₹" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya Verma");
        acc.deposit(10000);
        acc.withdraw(2500);
        acc.showBalance();
    }
}
