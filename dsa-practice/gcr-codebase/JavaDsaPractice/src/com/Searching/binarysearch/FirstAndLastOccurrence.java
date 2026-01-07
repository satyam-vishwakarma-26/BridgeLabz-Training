package com.Searching.binarysearch;


import java.util.Scanner;

public class FirstAndLastOccurrence{

    //find first occurrence
    public static int findFirst(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                result=mid;
                right=mid-1; //search left side
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }

    //find last occurrence
    public static int findLast(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                result=mid;
                left=mid+1; //search right side
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter sorted array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target=sc.nextInt();

        int first=findFirst(arr,target);
        int last=findLast(arr,target);

        if(first==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("First occurrence index: "+first);
            System.out.println("Last occurrence index: "+last);
        }
    }
}
