package com.EWalletApplication;

//Main class
public class EWalletApp{
  public static void main(String[] args){

      //users with different wallets
      User u1=new User("Rohan",new PersonalWallet(1000));
      User u2=new User("Amit",new BusinessWallet(2000));

      //add money
      u1.wallet.addMoney(500);
      u2.wallet.addMoney(1000);

      //show balances
      u1.showBalance();
      u2.showBalance();

      //transfer money (polymorphism)
      u1.wallet.transferTo(u2.wallet,300);
      u2.wallet.transferTo(u1.wallet,500);

      //final balances
      u1.showBalance();
      u2.showBalance();

      //transaction history
      System.out.println("\nTransaction History (Rohan):");
      u1.wallet.showHistory();
  }
}
