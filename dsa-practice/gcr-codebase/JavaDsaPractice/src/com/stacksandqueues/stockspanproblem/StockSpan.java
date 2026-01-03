package com.stacksandqueues.stockspanproblem;
import java.util.Stack;

class StockSpan {

	//calculate stock span
	static int[] calculateSpan(int[] price) {
		int n=price.length;
		int[] span=new int[n];
		Stack<Integer> stack=new Stack<>();

		//first day span
		span[0]=1;
		stack.push(0);

		for(int i=1;i<n;i++){
			//remove smaller prices
			while(!stack.isEmpty()&&price[stack.peek()]<=price[i]){
				stack.pop();
			}

			//calculate span
			span[i]=stack.isEmpty()?i+1:i-stack.peek();

			//push index
			stack.push(i);
		}
		return span;
	}
}
