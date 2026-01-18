package com.collections.list;
import java.util.*;

public class NthFromEnd {

	//method for find nth from end 
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return null;
            }
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    //main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        sc.nextLine();

        LinkedList<String> list = new LinkedList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        String result = findNthFromEnd(list, n);

        if (result != null) {
            System.out.println("Nth element from end: " + result);
        } else {
            System.out.println("Invalid N value");
        }

    }
}