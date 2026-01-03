package com.linkedlist.singlylinkedlist.StudentRecordManagement;

class StudentLinkedList {
	Student head;

	// Add student at beginning
	void addAtBeginning(int rollNo, String name, int age, char grade) {
		Student newNode = new Student(rollNo, name, age, grade);
		newNode.next = head;
		head = newNode;
	}

	// Add student at end
	void addAtEnd(int rollNo, String name, int age, char grade) {
		Student newNode = new Student(rollNo, name, age, grade);

		if (head == null) {
			head = newNode;
			return;
		}

		Student temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	// Add student at specific position
	void addAtPosition(int position, int rollNo, String name, int age, char grade) {
		if (position == 1) {
			addAtBeginning(rollNo, name, age, grade);
			return;
		}

		Student newNode = new Student(rollNo, name, age, grade);
		Student temp = head;

		for (int i = 1; i < position - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Invalid position");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Delete student by roll number
	void deleteByRollNo(int rollNo) {
		if (head == null) {
			return;
		}

		if (head.rollNo == rollNo) {
			head = head.next;
			return;
		}

		Student temp = head;
		while (temp.next != null && temp.next.rollNo != rollNo) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Student not found");
			return;
		}

		temp.next = temp.next.next;
	}

	// Search student by roll number
	void search(int rollNo) {
		Student temp = head;

		while (temp != null) {
			if (temp.rollNo == rollNo) {
				System.out.println("Found: " + temp.name + " Age: " + temp.age + " Grade: " + temp.grade);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Student not found");
	}

	// Update grade by roll number
	void updateGrade(int rollNo, char newGrade) {
		Student temp = head;

		while (temp != null) {
			if (temp.rollNo == rollNo) {
				temp.grade = newGrade;
				System.out.println("Grade updated successfully");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Student not found");
	}

	// Display all student records
	void display() {
		if (head == null) {
			System.out.println("No student records available");
			return;
		}

		Student temp = head;
		while (temp != null) {
			System.out.println(temp.rollNo + "\t" + temp.name + "\t" + temp.age + "\t" + temp.grade);
			temp = temp.next;
		}
	}
}

