package com.stacksandqueues.stockspanproblem;
public class StockSpanApp {
	public static void main(String[] args) {

		int[] prices={100,80,60,70,60,75,85};

		int[] span=StockSpan.calculateSpan(prices);

		//print span
		for(int i=0;i<span.length;i++){
			System.out.print(span[i]+" ");
		}
	}
}
