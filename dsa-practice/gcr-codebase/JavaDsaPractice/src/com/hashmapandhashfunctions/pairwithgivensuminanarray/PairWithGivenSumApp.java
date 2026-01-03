package com.hashmapandhashfunctions.pairwithgivensuminanarray;
import java.util.Scanner;

public class PairWithGivenSumApp {
	public static void main(String[] args){

		//Creating Scanner object 
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){
			System.out.print("Enter element "+i+": ");
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter target sum: ");
		int target=sc.nextInt();

		PairWithGivenSum.checkPair(arr,target);

		sc.close();
	}
}
