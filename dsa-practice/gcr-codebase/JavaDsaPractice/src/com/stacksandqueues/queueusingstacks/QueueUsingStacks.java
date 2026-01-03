package com.stacksandqueues.queueusingstacks;
import java.util.Stack;

class QueueUsingStacks {
	Stack<Integer> s1;
	Stack<Integer> s2;

	//constructor
	QueueUsingStacks() {
		s1=new Stack<>();
		s2=new Stack<>();
	}

	//enqueue
	void enqueue(int data) {
		s1.push(data);
	}

	//dequeue
	void dequeue() {
		if(s1.isEmpty()&&s2.isEmpty()){
			System.out.println("Queue empty");
			return;
		}
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		System.out.println(s2.pop());
	}
}
