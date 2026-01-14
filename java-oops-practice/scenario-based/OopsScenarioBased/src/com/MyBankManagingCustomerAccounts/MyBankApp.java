package com.MyBankManagingCustomerAccounts;

import java.util.Scanner;

public class MyBankApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to MyBank 🏦");
		System.out.println("Choose account type:");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter account number: ");
		String accNo = sc.next();

		System.out.print("Enter opening balance: ");
		double balance = sc.nextDouble();

		Account account;

		// Polymorphism
		if (choice == 1) {
			account = new SavingsAccount(accNo, balance);
		} else {
			account = new CurrentAccount(accNo, balance);
		}

		System.out.print("Enter deposit amount: ");
		account.deposit(sc.nextDouble());

		System.out.print("Enter withdrawal amount: ");
		account.withdraw(sc.nextDouble());

		account.checkBalance();
		account.calculateInterest();

		sc.close();
	}
}

