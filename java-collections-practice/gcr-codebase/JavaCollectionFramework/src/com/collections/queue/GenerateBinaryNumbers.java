package com.collections.queue;
import java.util.*;

public class GenerateBinaryNumbers {

    // generates first N binary numbers using queue
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        generateBinary(n);
    }
}