package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentMain {
	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();

		// Adding students
		list.addAtBeginning(1, "Satyam", 20, 'A');
		list.addAtEnd(2, "Aman", 21, 'B');
		list.addAtPosition(2, 3, "Rohit", 22, 'C');

		// Display records
		list.display();

		// Operations
		list.search(2);
		list.updateGrade(2, 'A');
		list.deleteByRollNo(1);

		System.out.println("After updates:");
		list.display();
	}
}

