package com.Objectmodeling.levelone;

//Customer class
class Customer{
  String name;
  int accountNumber;
  double balance;
  Bank bank; //association with Bank

  //constructor
  public Customer(String name,int accountNumber,double balance,Bank bank){
      this.name=name;
      this.accountNumber=accountNumber;
      this.balance=balance;
      this.bank=bank;
  }

  //view balance
  public void viewBalance(){
      System.out.println("Customer: "+name);
      System.out.println("Bank: "+bank.bankName);
      System.out.println("Account Number: "+accountNumber);
      System.out.println("Balance: ₹"+balance);
  }
}

