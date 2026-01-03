package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationApp {

	public static void main(String[] args) {

		TicketCircularLinkedList tickets =
			new TicketCircularLinkedList();

		tickets.addTicket(101,"Amit","Inception","A1","10:30 AM");
		tickets.addTicket(102,"Neha","Inception","A2","10:35 AM");
		tickets.addTicket(103,"Rahul","Avatar","B1","11:00 AM");

		System.out.println("All Tickets:");
		tickets.displayTickets();

		System.out.println("\nSearch by Customer:");
		tickets.searchByCustomer("Neha");

		System.out.println("\nSearch by Movie:");
		tickets.searchByMovie("Inception");

		System.out.println("\nCount Tickets:");
		tickets.countTickets();

		System.out.println("\nRemove Ticket:");
		tickets.removeTicket(102);

		System.out.println("\nUpdated Ticket List:");
		tickets.displayTickets();
	}
}

