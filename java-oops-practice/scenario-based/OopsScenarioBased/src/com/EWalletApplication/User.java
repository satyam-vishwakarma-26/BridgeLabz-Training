package com.EWalletApplication;

//User class
class User{
  String name;
  Wallet wallet;

  public User(String name,Wallet wallet){
      this.name=name;
      this.wallet=wallet;
  }

  public void showBalance(){
      System.out.println(name+"'s Balance: ₹"+wallet.getBalance());
  }
}
