package com.exceptionhandling;
import java.util.*;

public class UncheckedException {
	public static void main(String [] args) {
		//Creating the scanner class object 
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter two Number: ");
		
		//Handling the Exception by try and catch 
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		    System.out.println(a/b);
		}
		catch(ArithmeticException  | InputMismatchException e ) {
			System.out.print(e.getMessage());
		}
	}
}
