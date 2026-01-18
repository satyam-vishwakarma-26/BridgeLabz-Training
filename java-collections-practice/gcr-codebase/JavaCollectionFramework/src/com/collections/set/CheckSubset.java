package com.collections.set;
import java.util.*;

public class CheckSubset {

    // checks if set1 is a subset of set2
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {
    	//Created Scanner class object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first set: ");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Enter elements of first set:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.print("Enter size of second set: ");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements of second set:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        boolean result = isSubset(set1, set2);
        System.out.println(result);

        sc.close();
    }
}