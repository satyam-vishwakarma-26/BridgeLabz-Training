package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

public class InventoryApp {

	public static void main(String[] args) {

		InventoryLinkedList inventory = new InventoryLinkedList();

		inventory.addAtEnd(101,"Laptop",5,50000);
		inventory.addAtEnd(102,"Mouse",20,500);
		inventory.addAtBeginning(103,"Keyboard",10,1500);
		inventory.addAtPosition(2,104,"Monitor",7,12000);

		System.out.println("All Items:");
		inventory.displayAll();

		System.out.println("\nSearch Item:");
		inventory.searchById(102);

		System.out.println("\nUpdate Quantity:");
		inventory.updateQuantity(101,8);

		System.out.println("\nTotal Inventory Value:");
		inventory.calculateTotalValue();

		System.out.println("\nSort by Name (Ascending):");
		inventory.sortByNameAsc();
		inventory.displayAll();

		System.out.println("\nSort by Price (Descending):");
		inventory.sortByPriceDesc();
		inventory.displayAll();

		System.out.println("\nRemove Item:");
		inventory.removeById(103);
		inventory.displayAll();
	}
}

