package com.sorting.selectionsort;


import java.util.Scanner;

public class SelectionSortExamScores{

    //selection sort method
    public static void selectionSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;

            //find minimum element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            //swap minimum with current position
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
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

    	//Creating Scanner class object 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[] scores=new int[n];

        System.out.println("Enter exam scores:");
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }

        System.out.println("\nExam scores before sorting:");
        display(scores);

        selectionSort(scores);

        System.out.println("Exam scores after sorting:");
        display(scores);
    }
}
