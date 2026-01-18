package com.collections.list;
import java.util.*;

public class RemoveDuplicates {

	//removeDuplicates method 
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>();
        seen.addAll(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
    	//Creating Scanner class object 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> result = removeDuplicates(list);
        System.out.println("After removing duplicates: " + result);

        
    }
}