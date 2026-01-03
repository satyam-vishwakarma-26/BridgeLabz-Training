package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

//Node class for Singly Linked List
public class ItemNode {

	int itemId;
	String itemName;
	int quantity;
	double price;

	ItemNode next;

	//constructor
	public ItemNode(int itemId,String itemName,int quantity,double price){
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}

