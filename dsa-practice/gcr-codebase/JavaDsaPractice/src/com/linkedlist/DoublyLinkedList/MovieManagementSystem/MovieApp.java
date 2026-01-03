package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieApp {

	public static void main(String[] args) {

		MovieDoublyLinkedList list = new MovieDoublyLinkedList();

		list.addAtBeginning("Inception","Nolan",2010,8.8);
		list.addAtEnd("Interstellar","Nolan",2014,8.6);
		list.addAtEnd("Avatar","Cameron",2009,7.8);
		list.addAtPosition(2,"Tenet","Nolan",2020,7.4);

		System.out.println("Movies (Forward):");
		list.displayForward();

		System.out.println("\nMovies (Reverse):");
		list.displayReverse();

		System.out.println("\nSearch by Director:");
		list.searchByDirector("Nolan");

		System.out.println("\nUpdate Rating:");
		list.updateRating("Avatar",8.0);

		System.out.println("\nRemove Movie:");
		list.removeByTitle("Tenet");

		System.out.println("\nFinal List:");
		list.displayForward();
	}
}

