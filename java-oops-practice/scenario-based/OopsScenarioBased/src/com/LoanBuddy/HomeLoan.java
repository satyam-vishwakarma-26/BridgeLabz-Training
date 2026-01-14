package com.LoanBuddy;

public class HomeLoan extends LoanApplication{

	//constructor 
    public HomeLoan(int tenure){
        super("Home Loan",tenure,8.5);
    }

    //polymorphism
    public boolean approveLoan(Applicant applicant){
        if(applicant.getCreditScore()>=700 && applicant.getIncome()>=40000){
            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }
}
