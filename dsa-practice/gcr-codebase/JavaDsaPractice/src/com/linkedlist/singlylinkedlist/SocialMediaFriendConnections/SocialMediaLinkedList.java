package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

public class SocialMediaLinkedList {

	private UserNode head;

	//add user
	public void addUser(int id,String name,int age){

		UserNode newUser = new UserNode(id,name,age);

		if(head == null){
			head = newUser;
			return;
		}

		UserNode temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newUser;
	}

	//find user by ID
	private UserNode getUserById(int id){

		UserNode temp = head;
		while(temp != null){
			if(temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	//add friend connection
	public void addFriend(int userId,int friendId){

		UserNode user = getUserById(userId);
		UserNode friend = getUserById(friendId);

		if(user == null || friend == null){
			System.out.println("User not found");
			return;
		}

		addFriendToList(user,friendId);
		addFriendToList(friend,userId);

		System.out.println("Friend connection added");
	}

	//remove friend connection
	public void removeFriend(int userId,int friendId){

		UserNode user = getUserById(userId);
		UserNode friend = getUserById(friendId);

		if(user == null || friend == null){
			System.out.println("User not found");
			return;
		}

		removeFriendFromList(user,friendId);
		removeFriendFromList(friend,userId);

		System.out.println("Friend connection removed");
	}

	//add friend ID to friend list
	private void addFriendToList(UserNode user,int friendId){

		FriendNode newNode = new FriendNode(friendId);
		newNode.next = user.friends;
		user.friends = newNode;
	}

	//remove friend ID from friend list
	private void removeFriendFromList(UserNode user,int friendId){

		FriendNode temp = user.friends;
		FriendNode prev = null;

		while(temp != null){
			if(temp.friendId == friendId){
				if(prev == null)
					user.friends = temp.next;
				else
					prev.next = temp.next;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	//display friends of a user
	public void displayFriends(int userId){

		UserNode user = getUserById(userId);

		if(user == null){
			System.out.println("User not found");
			return;
		}

		System.out.print("Friends of " + user.name + ": ");

		FriendNode temp = user.friends;
		if(temp == null){
			System.out.println("No friends");
			return;
		}

		while(temp != null){
			System.out.print(temp.friendId + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	//find mutual friends
	public void findMutualFriends(int user1Id,int user2Id){

		UserNode u1 = getUserById(user1Id);
		UserNode u2 = getUserById(user2Id);

		if(u1 == null || u2 == null){
			System.out.println("User not found");
			return;
		}

		System.out.print("Mutual Friends: ");
		boolean found = false;

		FriendNode f1 = u1.friends;
		while(f1 != null){

			FriendNode f2 = u2.friends;
			while(f2 != null){
				if(f1.friendId == f2.friendId){
					System.out.print(f1.friendId + " ");
					found = true;
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}

		if(!found)
			System.out.print("None");

		System.out.println();
	}

	//search user by ID
	public void searchById(int id){

		UserNode user = getUserById(id);
		if(user != null)
			displayUser(user);
		else
			System.out.println("User not found");
	}

	//search user by name
	public void searchByName(String name){

		UserNode temp = head;
		boolean found = false;

		while(temp != null){
			if(temp.name.equalsIgnoreCase(name)){
				displayUser(temp);
				found = true;
			}
			temp = temp.next;
		}

		if(!found)
			System.out.println("User not found");
	}

	//count friends of each user
	public void countFriends(){

		UserNode temp = head;

		while(temp != null){
			int count = 0;
			FriendNode f = temp.friends;

			while(f != null){
				count++;
				f = f.next;
			}

			System.out.println(
				temp.name + " has " + count + " friends"
			);
			temp = temp.next;
		}
	}

	//helper method
	private void displayUser(UserNode u){

		System.out.println(
			"ID: " + u.userId +
			", Name: " + u.name +
			", Age: " + u.age
		);
	}
}

