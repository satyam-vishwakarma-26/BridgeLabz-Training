package com.encapsulation.BankingSystem;

//abstract class
abstract class BankAccount{
  private int accountNumber;
  private String holderName;
  protected double balance;

  //constructor
  public BankAccount(int accountNumber,String holderName,double balance){
      this.accountNumber=accountNumber;
      this.holderName=holderName;
      this.balance=balance;
  }

  //getter methods
  public int getAccountNumber(){
      return accountNumber;
  }
  public String getHolderName(){
      return holderName;
  }
  public double getBalance(){
      return balance;
  }

  //deposit
  public void deposit(double amount){
      if(amount>0){
          balance+=amount;
          System.out.println("Amount deposited: "+amount);
      }
  }

  //withdraw
  public void withdraw(double amount){
      if(amount<=balance){
          balance-=amount;
          System.out.println("Amount withdrawn: "+amount);
      }else{
          System.out.println("Insufficient balance");
      }
  }

  //abstract method
  public abstract double calculateInterest();

  //display details
  public void displayDetails(){
      System.out.println("Account No: "+accountNumber);
      System.out.println("Holder Name: "+holderName);
      System.out.println("Balance: "+balance);
  }
}








