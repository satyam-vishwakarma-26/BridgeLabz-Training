package com.LoanBuddy;

//IAllrovable interface 
public interface IApprovable{
    boolean approveLoan(Applicant applicant);
    double calculateEMI(double principal,int tenure,double annualRate);
}
