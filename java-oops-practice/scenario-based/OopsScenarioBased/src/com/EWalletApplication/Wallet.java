package com.EWalletApplication;
import java.util.ArrayList;

//abstract Wallet class
abstract class Wallet implements Transferrable{
  private double balance;
  ArrayList<Transaction> history=new ArrayList<>();

  public Wallet(double balance){
      this.balance=balance;
  }

  public double getBalance(){
      return balance;
  }

  protected void addBalance(double amount){
      balance+=amount;
  }

  protected boolean deductBalance(double amount){
      if(balance>=amount){
          balance-=amount;
          return true;
      }
      return false;
  }

  public void addMoney(double amount){
      addBalance(amount);
      history.add(new Transaction("Money Added",amount));
  }

  public void showHistory(){
      for(Transaction t:history){
          t.showTransaction();
      }
  }
}

