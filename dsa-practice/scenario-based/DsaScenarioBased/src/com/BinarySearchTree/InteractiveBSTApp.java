package com.BinarySearchTree;
import java.util.*;

public class InteractiveBSTApp {
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Record");
            System.out.println("2. Search Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Display Sorted Records");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID (Roll/SKU/Track): ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name/Value: ");
                    String value = sc.nextLine();
                    bst.insert(key, value);
                    System.out.println("Record inserted.");
                    break;

                case 2:
                    System.out.print("Enter ID to search: ");
                    int searchKey = sc.nextInt();
                    String result = bst.search(searchKey);
                    if (result != null)
                        System.out.println("Found: " + result);
                    else
                        System.out.println("Record not found.");
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteKey = sc.nextInt();
                    bst.delete(deleteKey);
                    System.out.println("Record deleted (if existed).");
                    break;

                case 4:
                    System.out.println("Sorted Records:");
                    bst.displaySorted();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
