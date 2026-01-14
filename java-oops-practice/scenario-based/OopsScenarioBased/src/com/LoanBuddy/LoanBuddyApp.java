package com.LoanBuddy;

import java.util.Scanner;

public class LoanBuddyApp{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        //Applicant input
        System.out.println("Enter Applicant Details");
        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Credit Score: ");
        int creditScore=sc.nextInt();

        System.out.print("Monthly Income: ");
        double income=sc.nextDouble();

        System.out.print("Loan Amount: ");
        double loanAmount=sc.nextDouble();

        Applicant applicant=new Applicant(name,creditScore,income,loanAmount);

        //Loan selection
        System.out.println("\nChoose Loan Type");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        int choice=sc.nextInt();

        System.out.print("Tenure (months): ");
        int tenure=sc.nextInt();

        LoanApplication loan;
        if(choice==1){
            loan=new HomeLoan(tenure);
        }else{
            loan=new AutoLoan(tenure);
        }

        //Approval
        System.out.println("\n--- Loan Evaluation ---");
        loan.showLoanDetails();

        boolean approved=loan.approveLoan(applicant);

        if(approved){
            double emi=loan.calculateEMI(
                    applicant.getLoanAmount(),
                    tenure,
                    loan.interestRate
            );
            System.out.println("Loan Approved ✅");
            System.out.println("Monthly EMI: ₹"+String.format("%.2f",emi));
        }else{
            System.out.println("Loan Rejected ❌");
        }
    }
}
