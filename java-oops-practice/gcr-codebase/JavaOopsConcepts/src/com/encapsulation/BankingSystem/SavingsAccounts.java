package com.encapsulation.BankingSystem;

//SavingsAccount class
class SavingsAccounts extends BankAccount implements Loanable{

  public SavingsAccounts(int acc,String name,double bal){
      super(acc,name,bal);
  }

  //interest calculation
  public double calculateInterest(){
      return balance*0.04; //4% interest
  }

  //loan methods
  public void applyForLoan(){
      System.out.println("Loan applied from Savings Account");
  }

  public double calculateLoanEligibility(){
      return balance*5;
  }
}
