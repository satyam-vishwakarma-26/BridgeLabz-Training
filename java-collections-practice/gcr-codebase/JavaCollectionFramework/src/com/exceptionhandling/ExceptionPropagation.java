package com.exceptionhandling;
import java.util.*;

public class ExceptionPropagation {
	public static void main(String[] args) {
		//Created Scanner object 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Amount, Rate, And Years");
		double amount=sc.nextDouble();
		double rate=sc.nextDouble();
		int years=sc.nextInt();
		
		try {
			double interest=CalculateInterest(amount, rate, years);
			System.out.println("Calculated Interest "+interest);
			
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
	//Method which calculating interest 
	public static double CalculateInterest(double amount, double rate, int years)throws IllegalArgumentException  {
		if(amount<0 || rate<0) {
			throw new IllegalArgumentException() ;
		}
		return (amount*rate*years)/100;
		
	}
}
