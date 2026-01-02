package com.EWalletApplication;

//PersonalWallet
class PersonalWallet extends Wallet{
  public PersonalWallet(double balance){
      super(balance);
  }

  //polymorphic transfer logic
  public void transferTo(Wallet receiver,double amount){
      if(deductBalance(amount)){
          receiver.addBalance(amount);
          System.out.println("Personal wallet transfer successful");
      }else{
          System.out.println("Insufficient balance");
      }
  }
}

