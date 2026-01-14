package com.LoanBuddy;


public abstract class LoanApplication implements IApprovable{

    protected String loanType;
    protected int tenure; //months
    protected double interestRate;

    private boolean approved; //restricted access

    //constructor 
    public LoanApplication(String loanType,int tenure,double interestRate){
        this.loanType=loanType;
        this.tenure=tenure;
        this.interestRate=interestRate;
    }

    protected void setApproved(boolean status){
        approved=status;
    }

    public boolean isApproved(){
        return approved;
    }

    //EMI formula
    public double calculateEMI(double P,int N,double annualRate){
        double R=annualRate/(12*100);
        return (P*R*Math.pow(1+R,N))/(Math.pow(1+R,N)-1);
    }

    //method for showdetails 
    public void showLoanDetails(){
        System.out.println("Loan Type: "+loanType);
        System.out.println("Tenure (months): "+tenure);
        System.out.println("Interest Rate: "+interestRate+"%");
    }
}
