package com.linkedlist.singlylinkedlist.StudentRecordManagement;

class Student {
	int rollNo;
	String name;
	int age;
	char grade;
	Student next;

	// Constructor to initialize student data
	Student(int rollNo, String name, int age, char grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}

