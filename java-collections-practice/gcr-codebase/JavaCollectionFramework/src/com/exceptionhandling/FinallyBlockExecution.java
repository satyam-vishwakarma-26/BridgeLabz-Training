package com.exceptionhandling;
import java.util.*;

public class FinallyBlockExecution {
	public static void main(String [] args) {
		//Created Scanner class Object 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Exception "+e);
		}finally {
			System.out.println("Operation Completed ");
		}
	}
}
