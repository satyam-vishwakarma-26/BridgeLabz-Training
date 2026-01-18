package com.collections.queue;
import java.util.*;

class StackUsingQueues {
	
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // push element onto stack
    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // removes top element
    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.remove();
    }

    // returns top element
    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        System.out.println("Enter operations (push value / pop / top):");
        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equalsIgnoreCase("push")) {
                int val = sc.nextInt();
                stack.push(val);
            } else if (op.equalsIgnoreCase("pop")) {
                System.out.println(stack.pop());
            } else if (op.equalsIgnoreCase("top")) {
                System.out.println(stack.top());
            }
        }

    }
}