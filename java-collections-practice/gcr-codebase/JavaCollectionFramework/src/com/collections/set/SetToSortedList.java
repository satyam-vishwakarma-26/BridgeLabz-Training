package com.collections.set;
import java.util.*;

public class SetToSortedList {

    // converts set to sorted list
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
    	//Created Scanner class object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList);

    }
}