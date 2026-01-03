package com.hashmapandhashfunctions.implementacustomhashmap;
class CustomHashMap {

	//node for chaining
	class Node {
		int key;
		int value;
		Node next;

		//constructor
		Node(int key,int value){
			this.key=key;
			this.value=value;
			this.next=null;
		}
	}

	private int size;
	private Node[] table;

	//constructor
	CustomHashMap(int size){
		this.size=size;
		table=new Node[size];
	}

	//hash function
	private int hash(int key){
		return key%size;
	}

	//insert key-value
	void put(int key,int value){
		int index=hash(key);
		Node head=table[index];

		//update if key exists
		while(head!=null){
			if(head.key==key){
				head.value=value;
				return;
			}
			head=head.next;
		}

		//add new node
		Node newNode=new Node(key,value);
		newNode.next=table[index];
		table[index]=newNode;
	}

	//get value by key
	Integer get(int key){
		int index=hash(key);
		Node head=table[index];

		while(head!=null){
			if(head.key==key){
				return head.value;
			}
			head=head.next;
		}
		return null;
	}

	//remove key
	void remove(int key){
		int index=hash(key);
		Node head=table[index];
		Node prev=null;

		while(head!=null){
			if(head.key==key){
				if(prev==null)
					table[index]=head.next;
				else
					prev.next=head.next;
				return;
			}
			prev=head;
			head=head.next;
		}
	}
}
