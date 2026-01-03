package com.hashmapandhashfunctions.twosumprobelm;
import java.util.Scanner;

public class TwoSumApp {
	public static void main(String[] args){

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

		TwoSum.findTwoSum(arr,target);

		sc.close();
	}
}
