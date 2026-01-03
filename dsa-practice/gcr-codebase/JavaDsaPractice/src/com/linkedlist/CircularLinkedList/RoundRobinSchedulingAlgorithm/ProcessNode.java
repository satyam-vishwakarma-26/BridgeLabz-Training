package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

//Node class for Circular Linked List
public class ProcessNode {

	int pid;
	int burstTime;
	int remainingTime;
	int priority;

	ProcessNode next;

	//constructor
	public ProcessNode(int pid,int burstTime,int priority){
		this.pid = pid;
		this.burstTime = burstTime;
		this.remainingTime = burstTime;
		this.priority = priority;
		this.next = null;
	}
}

