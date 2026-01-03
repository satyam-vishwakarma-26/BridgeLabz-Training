package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

public class SocialMediaApp {

	public static void main(String[] args) {

		SocialMediaLinkedList sm = new SocialMediaLinkedList();

		sm.addUser(1,"Amit",22);
		sm.addUser(2,"Neha",21);
		sm.addUser(3,"Rahul",23);
		sm.addUser(4,"Priya",22);

		sm.addFriend(1,2);
		sm.addFriend(1,3);
		sm.addFriend(2,3);
		sm.addFriend(3,4);

		System.out.println();
		sm.displayFriends(1);

		System.out.println();
		sm.findMutualFriends(1,2);

		System.out.println();
		sm.searchByName("Rahul");

		System.out.println();
		sm.countFriends();

		System.out.println();
		sm.removeFriend(1,3);
		sm.displayFriends(1);
	}
}

