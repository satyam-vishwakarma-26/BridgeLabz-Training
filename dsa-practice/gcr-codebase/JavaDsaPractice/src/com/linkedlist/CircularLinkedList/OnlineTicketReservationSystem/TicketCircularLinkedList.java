package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketCircularLinkedList {

	private TicketNode head;
	private TicketNode tail;

	//add ticket at end
	public void addTicket(int id,String customer,String movie,
						  String seat,String time){

		TicketNode newNode =
			new TicketNode(id,customer,movie,seat,time);

		if(head == null){
			head = tail = newNode;
			newNode.next = head;
		}else{
			tail.next = newNode;
			newNode.next = head;
			tail = newNode;
		}
	}

	//remove ticket by ID
	public void removeTicket(int id){

		if(head == null){
			System.out.println("No tickets available");
			return;
		}

		TicketNode curr = head;
		TicketNode prev = tail;

		do{
			if(curr.ticketId == id){

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

				System.out.println("Ticket removed successfully");
				return;
			}
			prev = curr;
			curr = curr.next;
		}while(curr != head);

		System.out.println("Ticket not found");
	}

	//display all tickets
	public void displayTickets(){

		if(head == null){
			System.out.println("No tickets to display");
			return;
		}

		TicketNode temp = head;
		do{
			displayTicket(temp);
			temp = temp.next;
		}while(temp != head);
	}

	//search by customer name
	public void searchByCustomer(String name){

		if(head == null){
			System.out.println("No tickets available");
			return;
		}

		TicketNode temp = head;
		boolean found = false;

		do{
			if(temp.customerName.equalsIgnoreCase(name)){
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		}while(temp != head);

		if(!found)
			System.out.println("No ticket found for customer");
	}

	//search by movie name
	public void searchByMovie(String movie){

		if(head == null){
			System.out.println("No tickets available");
			return;
		}

		TicketNode temp = head;
		boolean found = false;

		do{
			if(temp.movieName.equalsIgnoreCase(movie)){
				displayTicket(temp);
				found = true;
			}
			temp = temp.next;
		}while(temp != head);

		if(!found)
			System.out.println("No ticket found for movie");
	}

	//count total tickets
	public void countTickets(){

		if(head == null){
			System.out.println("Total Tickets: 0");
			return;
		}

		int count = 0;
		TicketNode temp = head;

		do{
			count++;
			temp = temp.next;
		}while(temp != head);

		System.out.println("Total Tickets: " + count);
	}

	//helper method
	private void displayTicket(TicketNode t){

		System.out.println(
			"TicketID: " + t.ticketId +
			", Customer: " + t.customerName +
			", Movie: " + t.movieName +
			", Seat: " + t.seatNumber +
			", Time: " + t.bookingTime
		);
	}
}

