package com.stacksandqueues.stackusingrecursion;
import java.util.Stack;

class SortStack {

	//sort stack recursively
	static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;

		//remove top element
		int temp=stack.pop();

		//sort remaining stack
		sortStack(stack);

		//insert element in sorted order
		insertSorted(stack,temp);
	}

	//insert element at correct position
	static void insertSorted(Stack<Integer> stack,int value) {
		if(stack.isEmpty()||stack.peek()<=value){
			stack.push(value);
			return;
		}

		//hold top element
		int temp=stack.pop();

		//recursive call
		insertSorted(stack,value);

		//push back element
		stack.push(temp);
	}
}
