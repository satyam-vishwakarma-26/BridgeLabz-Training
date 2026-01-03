package com.hashmapandhashfunctions.allsubarrayswithzerosum;
import java.util.*;

public class ZeroSumSubarraysApp {
	public static void main(String[] args){

		//Creating Scanner class 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n= sc.nextInt();
		System.out.print("Enter array element: ");
		int[] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		ZeroSumSubarrays.findSubarrays(arr);
	}
}
