package com.Searching.linearsearch;


import java.util.Scanner;

public class FirstNegativeLinearSearch{

    //method to find first negative number
    public static int findFirstNegative(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i; //return index
            }
        }
      //no negative number found
        return -1; 
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index=findFirstNegative(arr);

        if(index!=-1){
            System.out.println("First negative number found at index: "+index);
        }else{
            System.out.println("No negative number found in the array");
        }
    }
}
