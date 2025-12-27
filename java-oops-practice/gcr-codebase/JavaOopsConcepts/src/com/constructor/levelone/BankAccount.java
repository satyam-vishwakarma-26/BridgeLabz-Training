package com.constructor.levelone;

public class BankAccount {

    // public variable
    public String accountNumber;

    // protected variable
    protected String accountHolder;

    // private variable
    private double balance;

    // constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

