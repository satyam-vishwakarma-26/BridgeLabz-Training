package com.encapsulation.BankingSystem;

//CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable{

  public CurrentAccount(int acc,String name,double bal){
      super(acc,name,bal);
  }

  //interest calculation
  public double calculateInterest(){
      return balance*0.02; //2% interest
  }

  //loan methods
  public void applyForLoan(){
      System.out.println("Loan applied from Current Account");
  }

  public double calculateLoanEligibility(){
      return balance*3;
  }
}
