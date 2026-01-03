package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryDoublyLinkedList {

	private BookNode head;
	private BookNode tail;

	//add at beginning
	public void addAtBeginning(int id,String title,String author,String genre,boolean status){

		BookNode newNode = new BookNode(id,title,author,genre,status);

		if(head == null){
			head = tail = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	//add at end
	public void addAtEnd(int id,String title,String author,String genre,boolean status){

		BookNode newNode = new BookNode(id,title,author,genre,status);

		if(tail == null){
			head = tail = newNode;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	//add at specific position (1-based)
	public void addAtPosition(int pos,int id,String title,String author,String genre,boolean status){

		if(pos == 1){
			addAtBeginning(id,title,author,genre,status);
			return;
		}

		BookNode temp = head;
		for(int i=1;i<pos-1 && temp!=null;i++){
			temp = temp.next;
		}

		if(temp == null || temp.next == null){
			addAtEnd(id,title,author,genre,status);
		}else{
			BookNode newNode = new BookNode(id,title,author,genre,status);
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}
	}

	//remove book by ID
	public void removeById(int id){

		BookNode temp = head;

		while(temp != null){

			if(temp.bookId == id){

				if(temp == head){
					head = head.next;
					if(head != null)
						head.prev = null;
				}
				else if(temp == tail){
					tail = tail.prev;
					tail.next = null;
				}
				else{
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				System.out.println("Book removed successfully");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	//search by title
	public void searchByTitle(String title){

		BookNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.title.equalsIgnoreCase(title)){
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("Book not found");
	}

	//search by author
	public void searchByAuthor(String author){

		BookNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.author.equalsIgnoreCase(author)){
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("No books found for this author");
	}

	//update availability status
	public void updateAvailability(int id,boolean status){

		BookNode temp = head;

		while(temp != null){
			if(temp.bookId == id){
				temp.isAvailable = status;
				System.out.println("Availability updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book not found");
	}

	//display forward
	public void displayForward(){

		BookNode temp = head;
		while(temp != null){
			displayBook(temp);
			temp = temp.next;
		}
	}

	//display reverse
	public void displayReverse(){

		BookNode temp = tail;
		while(temp != null){
			displayBook(temp);
			temp = temp.prev;
		}
	}

	//count total books
	public void countBooks(){

		int count = 0;
		BookNode temp = head;

		while(temp != null){
			count++;
			temp = temp.next;
		}
		System.out.println("Total Books: " + count);
	}

	//helper method
	private void displayBook(BookNode b){

		System.out.println(
			"ID: " + b.bookId +
			", Title: " + b.title +
			", Author: " + b.author +
			", Genre: " + b.genre +
			", Available: " + b.isAvailable
		);
	}
}

