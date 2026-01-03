package com.stacksandqueues.stackusingrecursion;
import java.util.Stack;

public class SortStackApp {
	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<>();

		//push elements
		stack.push(30);
		stack.push(10);
		stack.push(50);
		stack.push(20);

		//sort stack
		SortStack.sortStack(stack);

		//display sorted stack
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}
