package com.collections.queue;
import java.util.*;

public class ReverseQueue {

    // reverses queue using recursion and queue operations only
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}