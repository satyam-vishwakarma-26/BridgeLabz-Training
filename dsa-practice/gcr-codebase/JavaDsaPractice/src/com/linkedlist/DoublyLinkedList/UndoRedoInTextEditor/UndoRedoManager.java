package com.linkedlist.DoublyLinkedList.UndoRedoInTextEditor;

public class UndoRedoManager {

	private TextStateNode head;
	private TextStateNode tail;
	private TextStateNode current;

	private int size;
	private final int MAX_SIZE = 10;

	//add new text state
	public void addState(String text){

		TextStateNode newNode = new TextStateNode(text);

		//clear redo history
		if(current != null && current.next != null){
			current.next.prev = null;
			current.next = null;
			tail = current;
		}

		if(head == null){
			head = tail = current = newNode;
			size = 1;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		current = newNode;
		size++;

		//limit history size
		if(size > MAX_SIZE){
			head = head.next;
			head.prev = null;
			size--;
		}
	}

	//undo operation
	public void undo(){

		if(current == null || current.prev == null){
			System.out.println("Nothing to undo");
			return;
		}

		current = current.prev;
		System.out.println("Undo performed");
	}

	//redo operation
	public void redo(){

		if(current == null || current.next == null){
			System.out.println("Nothing to redo");
			return;
		}

		current = current.next;
		System.out.println("Redo performed");
	}

	//display current text
	public void displayCurrent(){

		if(current == null){
			System.out.println("Editor is empty");
			return;
		}

		System.out.println("Current Text: " + current.text);
	}
}

