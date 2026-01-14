package com.EWalletApplication;

//BusinessWallet
class BusinessWallet extends Wallet{
  public BusinessWallet(double balance){
      super(balance);
  }

  //business logic with 2% tax
  public void transferTo(Wallet receiver,double amount){
      double tax=amount*0.02;
      double total=amount+tax;
      if(deductBalance(total)){
          receiver.addBalance(amount);
          System.out.println("Business wallet transfer successful (Tax ₹"+tax+")");
      }else{
          System.out.println("Insufficient balance");
      }
  }
}
