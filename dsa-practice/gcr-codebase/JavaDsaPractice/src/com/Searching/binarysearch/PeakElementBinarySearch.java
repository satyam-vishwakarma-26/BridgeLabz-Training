package com.Searching.binarysearch;


import java.util.Scanner;

public class PeakElementBinarySearch{

    //method to find peak element index
    public static int findPeak(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            //handle boundary cases
            boolean leftOk=(mid==0 || arr[mid]>arr[mid-1]);
            boolean rightOk=(mid==arr.length-1 || arr[mid]>arr[mid+1]);

            if(leftOk && rightOk){
                return mid; //peak found
            }

            if(mid>0 && arr[mid]<arr[mid-1]){
                right=mid-1; //search left half
            }else{
                left=mid+1; //search right half
            }
        }
        return -1; //should not occur for valid input
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

        int index=findPeak(arr);

        System.out.println("Peak element index: "+index);
        System.out.println("Peak element value: "+arr[index]);
    }
}
