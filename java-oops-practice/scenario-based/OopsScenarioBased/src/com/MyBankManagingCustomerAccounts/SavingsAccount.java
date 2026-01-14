package com.MyBankManagingCustomerAccounts;

class SavingsAccount extends Account {

	private final double interestRate = 4.0;

	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// Interest calculation for savings account
	void calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		System.out.println("Savings Account Interest: ₹" + interest);
	}
}

