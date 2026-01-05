package com.sorting.heapsort;


import java.util.Scanner;

public class HeapSortJobSalaries{

    //heap sort method
    public static void heapSort(int[] arr){
        int n=arr.length;

        //build max heap
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        //extract elements from heap
        for(int i=n-1;i>0;i--){
            //swap root with last element
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            //heapify reduced heap
            heapify(arr,i,0);
        }
    }

    //heapify method
    public static void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
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

        System.out.print("Enter number of job applicants: ");
        int n=sc.nextInt();

        int[] salaries=new int[n];

        System.out.println("Enter expected salary demands:");
        for(int i=0;i<n;i++){
            salaries[i]=sc.nextInt();
        }

        System.out.println("\nSalaries before sorting:");
        display(salaries);

        heapSort(salaries);

        System.out.println("Salaries after sorting:");
        display(salaries);
    }
}
