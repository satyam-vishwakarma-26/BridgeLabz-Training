package com.collections.queue;
import java.util.*;

class CircularBuffer {
    int[] buffer;
    int size;
    int front = 0;
    int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // inserts element, overwrites oldest if buffer is full
    void insert(int value) {
        int index = (front + count) % size;
        buffer[index] = value;

        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int size = sc.nextInt();
        CircularBuffer cb = new CircularBuffer(size);

        System.out.print("Enter number of insert operations: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            cb.insert(sc.nextInt());
            cb.display();
        }
    }
}