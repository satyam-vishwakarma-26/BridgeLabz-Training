
package com.multithreading.banksystem;

class BankAccount {
    private int balance = 10000;

    // Withdraw method 
    public synchronized boolean  withdraw(int amount) {
        if (balance >= amount) {
            // Simulate processing delay
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}
