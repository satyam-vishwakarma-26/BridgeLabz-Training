package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieDoublyLinkedList {

	private MovieNode head;
	private MovieNode tail;

	//add at beginning
	public void addAtBeginning(String title,String director,int year,double rating){

		MovieNode newNode = new MovieNode(title,director,year,rating);

		if(head == null){
			head = tail = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	//add at end
	public void addAtEnd(String title,String director,int year,double rating){

		MovieNode newNode = new MovieNode(title,director,year,rating);

		if(tail == null){
			head = tail = newNode;
		}else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	//add at specific position (1-based index)
	public void addAtPosition(int pos,String title,String director,int year,double rating){

		if(pos == 1){
			addAtBeginning(title,director,year,rating);
			return;
		}

		MovieNode temp = head;
		for(int i=1;i<pos-1 && temp!=null;i++){
			temp = temp.next;
		}

		if(temp == null || temp.next == null){
			addAtEnd(title,director,year,rating);
		}else{
			MovieNode newNode = new MovieNode(title,director,year,rating);
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}
	}

	//remove movie by title
	public void removeByTitle(String title){

		MovieNode temp = head;

		while(temp != null){

			if(temp.title.equalsIgnoreCase(title)){

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
				System.out.println("Movie removed successfully");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found");
	}

	//search by director
	public void searchByDirector(String director){

		MovieNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.director.equalsIgnoreCase(director)){
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("No movie found for this director");
	}

	//search by rating
	public void searchByRating(double rating){

		MovieNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.rating == rating){
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("No movie found with this rating");
	}

	//update rating by title
	public void updateRating(String title,double newRating){

		MovieNode temp = head;

		while(temp != null){
			if(temp.title.equalsIgnoreCase(title)){
				temp.rating = newRating;
				System.out.println("Rating updated successfully");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Movie not found");
	}

	//display forward
	public void displayForward(){

		MovieNode temp = head;

		while(temp != null){
			displayMovie(temp);
			temp = temp.next;
		}
	}

	//display reverse
	public void displayReverse(){

		MovieNode temp = tail;

		while(temp != null){
			displayMovie(temp);
			temp = temp.prev;
		}
	}

	//helper method to print movie
	private void displayMovie(MovieNode node){

		System.out.println(
			"Title: " + node.title +
			", Director: " + node.director +
			", Year: " + node.year +
			", Rating: " + node.rating
		);
	}
}

