package com.collections.bankingsystem;

class WithdrawalRequest {
    int accountNumber;
    int amount;

    //constructor for initializing object 
    WithdrawalRequest(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}