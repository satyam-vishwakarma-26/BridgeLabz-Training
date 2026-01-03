package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {

	private ProcessNode head;
	private ProcessNode tail;
	private int timeQuantum;
	private int currentTime;

	private int totalWaitingTime;
	private int totalTurnAroundTime;
	private int processCount;

	//constructor
	public RoundRobinScheduler(int timeQuantum){
		this.timeQuantum = timeQuantum;
		this.currentTime = 0;
	}

	//add process at end
	public void addProcess(int pid,int burstTime,int priority){

		ProcessNode newNode = new ProcessNode(pid,burstTime,priority);
		processCount++;

		if(head == null){
			head = tail = newNode;
			newNode.next = head;
		}else{
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}

	//remove process by PID
	private void removeProcess(ProcessNode prev,ProcessNode curr){

		if(curr == head && curr == tail){
			head = tail = null;
		}
		else if(curr == head){
			head = head.next;
			tail.next = head;
		}
		else if(curr == tail){
			tail = prev;
			tail.next = head;
		}
		else{
			prev.next = curr.next;
		}
	}

	//simulate round robin scheduling
	public void execute(){

		if(head == null){
			System.out.println("No processes to schedule");
			return;
		}

		ProcessNode curr = head;
		ProcessNode prev = tail;

		while(head != null){

			displayQueue();

			if(curr.remainingTime > timeQuantum){
				curr.remainingTime -= timeQuantum;
				currentTime += timeQuantum;
			}
			else{
				currentTime += curr.remainingTime;
				curr.remainingTime = 0;

				//calculate waiting & turnaround time
				int turnAroundTime = currentTime;
				int waitingTime = turnAroundTime - curr.burstTime;

				totalWaitingTime += waitingTime;
				totalTurnAroundTime += turnAroundTime;

				System.out.println(
					"Process " + curr.pid + " completed | WT: "
					+ waitingTime + " | TAT: " + turnAroundTime
				);

				removeProcess(prev,curr);
				curr = prev.next;
				continue;
			}

			prev = curr;
			curr = curr.next;
		}

		printAverageTimes();
	}

	//display circular queue
	private void displayQueue(){

		if(head == null)
			return;

		ProcessNode temp = head;
		System.out.print("Queue: ");

		do{
			System.out.print(
				"[P" + temp.pid + " RT:" + temp.remainingTime + "] "
			);
			temp = temp.next;
		}while(temp != head);

		System.out.println();
	}

	//print averages
	private void printAverageTimes(){

		System.out.println("\nAverage Waiting Time: "
			+ (double)totalWaitingTime / processCount);

		System.out.println("Average Turnaround Time: "
			+ (double)totalTurnAroundTime / processCount);
	}
}

