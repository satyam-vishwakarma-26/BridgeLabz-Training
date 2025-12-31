package com.Inheritance.HierarchicalInheritance;

//FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount{
int tenure;

FixedDepositAccount(String accountNumber,double balance,int tenure){
    super(accountNumber,balance);
    this.tenure=tenure;
}

void displayAccountType(){
    System.out.println("Account Type: Fixed Deposit Account");
    displayDetails();
    System.out.println("Tenure: "+tenure+" months");
}
}
