package com.stacksandqueues.queueusingstacks;

public class QueueApp {
	public static void main(String[] args) {

		//making object of the queue 
		QueueUsingStacks q=new QueueUsingStacks();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
}
