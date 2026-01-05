package com.sorting.countingsort;


import java.util.Scanner;

public class CountingSortStudentAges{

    //counting sort method
    public static void countingSort(int[] ages){
        int minAge=10;
        int maxAge=18;
        int range=maxAge-minAge+1;

        int[] count=new int[range];
        int[] output=new int[ages.length];

        //count frequency of each age
        for(int i=0;i<ages.length;i++){
            count[ages[i]-minAge]++;
        }

        //cumulative count
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        //build output array (stable)
        for(int i=ages.length-1;i>=0;i--){
            int age=ages[i];
            int index=count[age-minAge]-1;
            output[index]=age;
            count[age-minAge]--;
        }

        //copy back to original array
        for(int i=0;i<ages.length;i++){
            ages[i]=output[i];
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

    	//Creating Scanner object and taking user inputs 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[] ages=new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for(int i=0;i<n;i++){
            ages[i]=sc.nextInt();
        }

        System.out.println("\nAges before sorting:");
        display(ages);

        countingSort(ages);

        System.out.println("Ages after sorting:");
        display(ages);
    }
}
