package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskCircularLinkedList {

	private TaskNode head;
	private TaskNode tail;
	private TaskNode current; //for scheduler

	//add at beginning
	public void addAtBeginning(int id,String name,int priority,String date){

		TaskNode newNode = new TaskNode(id,name,priority,date);

		if(head == null){
			head = tail = newNode;
			newNode.next = head;
		}else{
			newNode.next = head;
			tail.next = newNode;
			head = newNode;
		}
	}

	//add at end
	public void addAtEnd(int id,String name,int priority,String date){

		TaskNode newNode = new TaskNode(id,name,priority,date);

		if(head == null){
			head = tail = newNode;
			newNode.next = head;
		}else{
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}

	//add at specific position (1-based)
	public void addAtPosition(int pos,int id,String name,int priority,String date){

		if(pos == 1){
			addAtBeginning(id,name,priority,date);
			return;
		}

		TaskNode temp = head;
		for(int i=1;i<pos-1 && temp.next!=head;i++){
			temp = temp.next;
		}

		TaskNode newNode = new TaskNode(id,name,priority,date);
		newNode.next = temp.next;
		temp.next = newNode;

		if(temp == tail)
			tail = newNode;
	}

	//remove task by ID
	public void removeById(int id){

		if(head == null){
			System.out.println("Task list is empty");
			return;
		}

		TaskNode temp = head;
		TaskNode prev = tail;

		do{
			if(temp.taskId == id){

				if(temp == head){
					head = head.next;
					tail.next = head;
				}
				else if(temp == tail){
					tail = prev;
					tail.next = head;
				}
				else{
					prev.next = temp.next;
				}
				System.out.println("Task removed successfully");
				return;
			}
			prev = temp;
			temp = temp.next;
		}while(temp != head);

		System.out.println("Task not found");
	}

	//view current task and move to next
	public void viewNextTask(){

		if(head == null){
			System.out.println("No tasks available");
			return;
		}

		if(current == null)
			current = head;

		displayTask(current);
		current = current.next;
	}

	//display all tasks
	public void displayAll(){

		if(head == null){
			System.out.println("No tasks to display");
			return;
		}

		TaskNode temp = head;
		do{
			displayTask(temp);
			temp = temp.next;
		}while(temp != head);
	}

	//search by priority
	public void searchByPriority(int priority){

		if(head == null){
			System.out.println("Task list is empty");
			return;
		}

		TaskNode temp = head;
		boolean found = false;

		do{
			if(temp.priority == priority){
				displayTask(temp);
				found = true;
			}
			temp = temp.next;
		}while(temp != head);

		if(!found)
			System.out.println("No task found with given priority");
	}

	//helper method
	private void displayTask(TaskNode t){

		System.out.println(
			"ID: " + t.taskId +
			", Name: " + t.taskName +
			", Priority: " + t.priority +
			", Due Date: " + t.dueDate
		);
	}
}

