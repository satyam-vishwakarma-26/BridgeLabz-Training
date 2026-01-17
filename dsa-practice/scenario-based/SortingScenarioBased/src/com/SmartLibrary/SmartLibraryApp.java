package com.SmartLibrary;
import java.util.Scanner;

// Test class for SmartLibrary system
public class SmartLibraryApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SmartLibraryManager manager=new SmartLibraryManager();
        int choice;

        // Menu driven library kiosk
        do{
            System.out.println("\n1.Issue Book\n2.Display Borrowed Books\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter book title: ");
                    String title=sc.nextLine();
                    manager.addBook(title);
                    break;
                case 2:
                    manager.displayBooks();
                    break;
                case 0:
                    System.out.println("Library kiosk closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
