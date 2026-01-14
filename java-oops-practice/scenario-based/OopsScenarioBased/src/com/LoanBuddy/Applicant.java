package com.LoanBuddy;

public class Applicant{
    private String name;
    private int creditScore;   //sensitive
    private double income;
    private double loanAmount;

    //constructor 
    public Applicant(String name,int creditScore,double income,double loanAmount){
        this.name=name;
        this.creditScore=creditScore;
        this.income=income;
        this.loanAmount=loanAmount;
    }

    //only getters (encapsulation)
    public String getName(){
        return name;
    }

    public int getCreditScore(){
        return creditScore;
    }

    public double getIncome(){
        return income;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
}
