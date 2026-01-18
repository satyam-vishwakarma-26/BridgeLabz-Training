package com.collections.list;
import java.util.*;

public class RotateList {

    // rotate list to the left by k positions
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n;

        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    // helper method to reverse part of the list
    private static <T> void reverse(List<T> list, int start, int end) {
        while (start < end) {
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    //main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter rotation value: ");
        int k = sc.nextInt();

        rotateList(list, k);

        System.out.println("Rotated List: " + list);
       
    }
}