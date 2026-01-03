package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

//Node class for Circular Linked List
public class TicketNode {

	int ticketId;
	String customerName;
	String movieName;
	String seatNumber;
	String bookingTime;

	TicketNode next;

	//constructor
	public TicketNode(int ticketId,String customerName,String movieName,
					  String seatNumber,String bookingTime){
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.bookingTime = bookingTime;
		this.next = null;
	}
}

