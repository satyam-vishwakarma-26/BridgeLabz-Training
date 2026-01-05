package com.sorting.mergesort;


import java.util.Scanner;

public class MergeSortBookPrices{

    //merge sort method
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;

            //sort first half
            mergeSort(arr,left,mid);
            //sort second half
            mergeSort(arr,mid+1,right);

            //merge both halves
            merge(arr,left,mid,right);
        }
    }

    //merge two sorted subarrays
    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];

        //copy data to temp arrays
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=left;

        //merge temp arrays
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        //copy remaining elements
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
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

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n=sc.nextInt();

        int[] prices=new int[n];

        System.out.println("Enter book prices:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        System.out.println("\nBook prices before sorting:");
        display(prices);

        //calling merge sort method 
        mergeSort(prices,0,n-1);

        System.out.println("Book prices after sorting:");
        display(prices);
    }
}
