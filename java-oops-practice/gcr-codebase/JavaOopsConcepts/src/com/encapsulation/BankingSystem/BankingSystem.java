package com.encapsulation.BankingSystem;

import java.util.ArrayList;
import java.util.List;

//Main class
public class BankingSystem{
  public static void main(String[] args){

      //polymorphism
      List<BankAccount> accounts=new ArrayList<>();

      accounts.add(new SavingsAccounts(101,"Rohan",10000));
      accounts.add(new CurrentAccount(102,"Amit",20000));

      for(BankAccount acc:accounts){
          System.out.println("\n--- Account Details ---");
          acc.displayDetails();
          System.out.println("Interest: "+acc.calculateInterest());

          //loan processing
          Loanable loan=(Loanable)acc;
          loan.applyForLoan();
          System.out.println("Loan Eligibility: "+loan.calculateLoanEligibility());
      }
  }
}
