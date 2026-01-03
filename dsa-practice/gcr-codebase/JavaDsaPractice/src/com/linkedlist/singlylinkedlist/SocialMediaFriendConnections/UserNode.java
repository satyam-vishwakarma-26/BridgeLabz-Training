package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

//Node to store User details
public class UserNode {

	int userId;
	String name;
	int age;

	FriendNode friends;   //head of friend list
	UserNode next;

	//constructor
	public UserNode(int userId,String name,int age){
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friends = null;
		this.next = null;
	}
}

