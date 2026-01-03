package com.hashmapandhashfunctions.longestconsecutivesequence;
import java.util.Scanner;

public class LongestConsecutiveSequenceApp {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){
			System.out.print("Enter element "+i+": ");
			arr[i]=sc.nextInt();
		}

		int result=LongestConsecutiveSequence.findLongest(arr);

		System.out.println("Longest consecutive sequence length: "+result);

		sc.close();
	}
}
