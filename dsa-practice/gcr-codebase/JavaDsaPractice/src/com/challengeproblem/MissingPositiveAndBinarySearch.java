package com.challengeproblem;


import java.util.Arrays;
import java.util.Scanner;

public class MissingPositiveAndBinarySearch{

    //method to find first missing positive integer
    public static int firstMissingPositive(int[] arr){
        int n=arr.length;
        boolean[] present=new boolean[n+1];

        //mark positive numbers
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<=n){
                present[arr[i]]=true;
            }
        }

        //find first missing positive
        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
    }

    //binary search method
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
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

        //find first missing positive
        int missing=firstMissingPositive(arr);
        System.out.println("First missing positive integer: "+missing);

        //sort array for binary search
        Arrays.sort(arr);

        System.out.print("Enter target element to search: ");
        int target=sc.nextInt();

        int index=binarySearch(arr,target);

        if(index!=-1){
            System.out.println("Target found at index (after sorting): "+index);
        }else{
            System.out.println("Target not found");
        }
    }
}
