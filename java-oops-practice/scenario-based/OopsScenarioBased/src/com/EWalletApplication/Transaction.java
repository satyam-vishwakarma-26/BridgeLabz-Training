package com.EWalletApplication;


//Transaction class
class Transaction{
  String type;
  double amount;

  public Transaction(String type,double amount){
      this.type=type;
      this.amount=amount;
  }

  public void showTransaction(){
      System.out.println(type+" : ₹"+amount);
  }
}
