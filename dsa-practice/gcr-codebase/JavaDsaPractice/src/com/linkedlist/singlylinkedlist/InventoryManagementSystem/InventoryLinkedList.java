package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

public class InventoryLinkedList {

	private ItemNode head;

	//add at beginning
	public void addAtBeginning(int id,String name,int qty,double price){

		ItemNode newNode = new ItemNode(id,name,qty,price);
		newNode.next = head;
		head = newNode;
	}

	//add at end
	public void addAtEnd(int id,String name,int qty,double price){

		ItemNode newNode = new ItemNode(id,name,qty,price);

		if(head == null){
			head = newNode;
			return;
		}

		ItemNode temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}

	//add at specific position (1-based)
	public void addAtPosition(int pos,int id,String name,int qty,double price){

		if(pos == 1){
			addAtBeginning(id,name,qty,price);
			return;
		}

		ItemNode temp = head;
		for(int i=1;i<pos-1 && temp!=null;i++){
			temp = temp.next;
		}

		if(temp == null){
			System.out.println("Invalid position");
			return;
		}

		ItemNode newNode = new ItemNode(id,name,qty,price);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	//remove item by ID
	public void removeById(int id){

		if(head == null)
			return;

		if(head.itemId == id){
			head = head.next;
			System.out.println("Item removed");
			return;
		}

		ItemNode temp = head;
		while(temp.next != null){
			if(temp.next.itemId == id){
				temp.next = temp.next.next;
				System.out.println("Item removed");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	//update quantity by ID
	public void updateQuantity(int id,int newQty){

		ItemNode temp = head;
		while(temp != null){
			if(temp.itemId == id){
				temp.quantity = newQty;
				System.out.println("Quantity updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	//search by ID
	public void searchById(int id){

		ItemNode temp = head;
		while(temp != null){
			if(temp.itemId == id){
				displayItem(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	//search by name
	public void searchByName(String name){

		ItemNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.itemName.equalsIgnoreCase(name)){
				displayItem(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("Item not found");
	}

	//calculate total inventory value
	public void calculateTotalValue(){

		double total = 0;
		ItemNode temp = head;

		while(temp != null){
			total += temp.quantity * temp.price;
			temp = temp.next;
		}
		System.out.println("Total Inventory Value: " + total);
	}

	//sort by name (ascending)
	public void sortByNameAsc(){

		if(head == null)
			return;

		for(ItemNode i=head;i!=null;i=i.next){
			for(ItemNode j=i.next;j!=null;j=j.next){
				if(i.itemName.compareToIgnoreCase(j.itemName) > 0){
					swapData(i,j);
				}
			}
		}
	}

	//sort by price (descending)
	public void sortByPriceDesc(){

		if(head == null)
			return;

		for(ItemNode i=head;i!=null;i=i.next){
			for(ItemNode j=i.next;j!=null;j=j.next){
				if(i.price < j.price){
					swapData(i,j);
				}
			}
		}
	}

	//display all items
	public void displayAll(){

		ItemNode temp = head;
		while(temp != null){
			displayItem(temp);
			temp = temp.next;
		}
	}

	//swap node data
	private void swapData(ItemNode a,ItemNode b){

		int id = a.itemId;
		String name = a.itemName;
		int qty = a.quantity;
		double price = a.price;

		a.itemId = b.itemId;
		a.itemName = b.itemName;
		a.quantity = b.quantity;
		a.price = b.price;

		b.itemId = id;
		b.itemName = name;
		b.quantity = qty;
		b.price = price;
	}

	//helper method
	private void displayItem(ItemNode item){

		System.out.println(
			"ID: " + item.itemId +
			", Name: " + item.itemName +
			", Qty: " + item.quantity +
			", Price: " + item.price
		);
	}
}

