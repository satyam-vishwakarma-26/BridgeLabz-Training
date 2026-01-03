package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskSchedulerApp {

	public static void main(String[] args) {

		TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

		scheduler.addAtEnd(1,"Design Module",2,"10-01-2026");
		scheduler.addAtEnd(2,"Code Implementation",1,"15-01-2026");
		scheduler.addAtBeginning(3,"Requirement Analysis",3,"05-01-2026");
		scheduler.addAtPosition(2,4,"Testing",2,"20-01-2026");

		System.out.println("All Tasks:");
		scheduler.displayAll();

		System.out.println("\nView Current Task:");
		scheduler.viewNextTask();

		System.out.println("\nView Next Task:");
		scheduler.viewNextTask();

		System.out.println("\nSearch by Priority:");
		scheduler.searchByPriority(2);

		System.out.println("\nRemove Task:");
		scheduler.removeById(2);

		System.out.println("\nFinal Task List:");
		scheduler.displayAll();
	}
}

