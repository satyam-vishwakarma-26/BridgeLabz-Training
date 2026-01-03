package com.MyBankManagingCustomerAccounts;

abstract class Account implements ITransaction {
	protected String accountNumber;
	private double balance;

	// Constructor without opening balance
	Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// Constructor with opening balance
	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited: ₹" + amount);
		}
	}

	// Withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	// Check balance
	public void checkBalance() {
		System.out.println("Current balance: ₹" + balance);
	}

	// Getter for subclasses
	protected double getBalance() {
		return balance;
	}

	// Abstract method for interest
	abstract void calculateInterest();
}

