package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryApp {

	public static void main(String[] args) {

		LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

		library.addAtEnd(101,"Java Basics","James Gosling","Programming",true);
		library.addAtEnd(102,"Clean Code","Robert Martin","Programming",true);
		library.addAtBeginning(103,"Atomic Habits","James Clear","Self Help",false);
		library.addAtPosition(2,104,"The Alchemist","Paulo Coelho","Fiction",true);

		System.out.println("All Books (Forward):");
		library.displayForward();

		System.out.println("\nAll Books (Reverse):");
		library.displayReverse();

		System.out.println("\nSearch by Title:");
		library.searchByTitle("Clean Code");

		System.out.println("\nSearch by Author:");
		library.searchByAuthor("James Clear");

		System.out.println("\nUpdate Availability:");
		library.updateAvailability(103,true);

		System.out.println("\nRemove Book:");
		library.removeById(102);

		System.out.println("\nFinal Library:");
		library.displayForward();

		System.out.println("\nCount Books:");
		library.countBooks();
	}
}

