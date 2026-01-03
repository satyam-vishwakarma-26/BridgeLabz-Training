package com.MyBankManagingCustomerAccounts;

class CurrentAccount extends Account {

	private final double interestRate = 1.0;

	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// Interest calculation for current account
	void calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		System.out.println("Current Account Interest: ₹" + interest);
	}
}

