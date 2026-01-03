package com.linkedlist.DoublyLinkedList.UndoRedoInTextEditor;

//Node class for Doubly Linked List
public class TextStateNode {

	String text;
	TextStateNode prev;
	TextStateNode next;

	//constructor
	public TextStateNode(String text){
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}

