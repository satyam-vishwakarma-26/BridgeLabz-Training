package com.String_builder_buffer.StringBuilder;
import java.util.*;

public class ReverseString {
 
	//main method 
	public static void main(String [] args) {
		//Creating Scanner class object 
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter Your Name: ");
		String name=sc.next();
		
		StringBuilder sb=new StringBuilder(name);
		
		sb.reverse();
		
		System.out.println("Reverse of the "+name+" is "+sb.toString());
	}
}
