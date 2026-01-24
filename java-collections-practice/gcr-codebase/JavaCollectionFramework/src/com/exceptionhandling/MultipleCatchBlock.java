package com.exceptionhandling;
import java.util.*;

public class MultipleCatchBlock {
	public static void main(String [] args) {
		
		//Created Scanner object 
		Scanner sc=new Scanner (System.in);
		int arr[]= null;
		
		try{
			System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		arr=new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter an index no.");
		int index=sc.nextInt();
		
			System.out.println(arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index!");
		}catch(NullPointerException e) {
			System.out.println("Array is not initialized!");
		}
	}
}
