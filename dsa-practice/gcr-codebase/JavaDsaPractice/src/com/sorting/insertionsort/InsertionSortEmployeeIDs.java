package com.sorting.insertionsort;


import java.util.Scanner;

public class InsertionSortEmployeeIDs{

    //insertion sort method
    public static void insertionSort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            //shift elements greater than key
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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

    	//creating scanner object and taking user inputs 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();

        int[] empIds=new int[n];

        System.out.println("Enter employee IDs:");
        for(int i=0;i<n;i++){
            empIds[i]=sc.nextInt();
        }

        System.out.println("\nEmployee IDs before sorting:");
        display(empIds);

        //calling the sort method 
        insertionSort(empIds);

        System.out.println("Employee IDs after sorting:");
        display(empIds);
    }
}
