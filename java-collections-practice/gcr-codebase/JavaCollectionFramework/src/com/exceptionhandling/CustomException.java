package com.exceptionhandling;
import java.util.Scanner;

public class CustomException {

	public static void main(String [] args) {
		//Creating Scanner class object 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Age Of the Student: ");
		int age=sc.nextInt();
		try {
			validateAge(age);
		}catch(InvalidAgeException e) {
			System.out.print(e.getMessage());
		}
	}
	//method which check age 
	public static void validateAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("Access Granted ");
		}else {
			throw new InvalidAgeException("InvalidAgeException please use age above 18");
		}
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}