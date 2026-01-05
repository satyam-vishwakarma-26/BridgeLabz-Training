package com.sorting.quicksort;


import java.util.Scanner;

public class QuickSortProductPrices{

    //quick sort method
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);

            //sort left part
            quickSort(arr,low,pivotIndex-1);
            //sort right part
            quickSort(arr,pivotIndex+1,high);
        }
    }

    //partition method
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high]; //pivot as last element
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //place pivot at correct position
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    //display array
    public static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args){

    	//Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n=sc.nextInt();

        int[] prices=new int[n];

        System.out.println("Enter product prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        System.out.println("\nProduct prices before sorting:");
        display(prices);

        quickSort(prices,0,n-1);

        System.out.println("Product prices after sorting:");
        display(prices);
    }
}
