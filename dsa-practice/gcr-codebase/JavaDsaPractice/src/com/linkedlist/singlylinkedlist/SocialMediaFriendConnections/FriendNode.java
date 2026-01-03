package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

//Node to store Friend ID
public class FriendNode {

	int friendId;
	FriendNode next;

	//constructor
	public FriendNode(int friendId){
		this.friendId = friendId;
		this.next = null;
	}
}
