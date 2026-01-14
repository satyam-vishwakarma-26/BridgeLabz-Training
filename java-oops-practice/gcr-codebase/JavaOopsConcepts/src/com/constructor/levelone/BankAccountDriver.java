package com.constructor.levelone;

public class BankAccountDriver {

    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount("ACC12345",
                                   "Satyam",
                                   25000,
                                   4.5);

        sa.displaySavingsAccount();

        System.out.println("-----");

        // modify balance using setter
        sa.setBalance(30000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
