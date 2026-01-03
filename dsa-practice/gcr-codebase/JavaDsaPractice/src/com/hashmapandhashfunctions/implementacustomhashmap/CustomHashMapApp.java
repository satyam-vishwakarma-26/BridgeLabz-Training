package com.hashmapandhashfunctions.implementacustomhashmap;
import java.util.Scanner;

public class CustomHashMapApp {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter hash table size: ");
		int size=sc.nextInt();

		CustomHashMap map=new CustomHashMap(size);

		//insert values
		map.put(1,100);
		map.put(2,200);
		map.put(3,300);

		//get value
		System.out.println("Value for key 2: "+map.get(2));

		//remove key
		map.remove(2);

		//check after removal
		System.out.println("Value for key 2 after removal: "+map.get(2));

		sc.close();
	}
}
