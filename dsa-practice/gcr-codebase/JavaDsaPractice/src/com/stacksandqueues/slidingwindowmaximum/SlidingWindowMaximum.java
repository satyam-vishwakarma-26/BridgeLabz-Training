package com.stacksandqueues.slidingwindowmaximum;
import java.util.Deque;
import java.util.ArrayDeque;

class SlidingWindowMaximum {

	//find max in each window
	static void maxSlidingWindow(int[] arr,int k) {
		if(arr.length==0||k<=0)
			return;

		Deque<Integer> dq=new ArrayDeque<>();

		for(int i=0;i<arr.length;i++){
			//remove out of window index
			if(!dq.isEmpty()&&dq.peekFirst()<=i-k){
				dq.pollFirst();
			}

			//remove smaller elements
			while(!dq.isEmpty()&&arr[dq.peekLast()]<=arr[i]){
				dq.pollLast();
			}

			//add current index
			dq.offerLast(i);

			//print max after first window
			if(i>=k-1){
				System.out.print(arr[dq.peekFirst()]+" ");
			}
		}
	}
}
