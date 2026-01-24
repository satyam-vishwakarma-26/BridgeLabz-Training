package com.exceptionhandling;
import java.util.*;

public class NestedTryCatchExample {

    public static void main(String[] args) {

    	//Created Scanner Class object 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index to access:");
        int index = sc.nextInt();

        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();

        try {
           
            try {
                int value = arr[index]; 
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            // Not required, but safety
            System.out.println("Some error occurred");
        }
    }
}
