package com.constructor.levelone;

public class SavingsAccount extends BankAccount {

    public double interestRate;

    // constructor
    public SavingsAccount(String accountNumber,
                          String accountHolder,
                          double balance,
                          double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // access public and protected members
    public void displaySavingsAccount() {
        System.out.println("Account Number: " + accountNumber);     // public
        System.out.println("Account Holder: " + accountHolder);     // protected
        System.out.println("Balance: " + getBalance());             // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

