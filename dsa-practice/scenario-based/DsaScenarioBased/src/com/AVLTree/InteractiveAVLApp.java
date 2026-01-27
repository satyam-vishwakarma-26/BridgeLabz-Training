package com.AVLTree;
import java.util.Scanner;

public class InteractiveAVLApp {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== AVL MENU =====");
            System.out.println("1. Insert/Update");
            System.out.println("2. Search");
            System.out.println("3. Display Sorted");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Key (score/time/id): ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Value (name): ");
                    String value = sc.nextLine();
                    avl.insert(key, value);
                    System.out.println("Inserted/Updated.");
                    break;

                case 2:
                    System.out.print("Enter key to search: ");
                    int searchKey = sc.nextInt();
                    String result = avl.search(searchKey);
                    System.out.println(result != null ? "Found: " + result : "Not found");
                    break;

                case 3:
                    System.out.println("Sorted Data:");
                    avl.displaySorted();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;
            }
        }
    }
}
