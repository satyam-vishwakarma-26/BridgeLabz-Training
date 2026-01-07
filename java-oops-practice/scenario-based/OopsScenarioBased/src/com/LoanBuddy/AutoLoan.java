package com.LoanBuddy;

public class AutoLoan extends LoanApplication{

	//autoloan constructor 
    public AutoLoan(int tenure){
        super("Auto Loan",tenure,10.5);
    }

    //polymorphism
    public boolean approveLoan(Applicant applicant){
        if(applicant.getCreditScore()>=650 && applicant.getIncome()>=30000){
            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }
}
