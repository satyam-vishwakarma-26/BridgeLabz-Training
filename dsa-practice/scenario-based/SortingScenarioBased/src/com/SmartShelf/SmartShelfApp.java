package com.SmartShelf;
import java.util.Scanner;

// Test class for SmartShelf system
public class SmartShelfApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SmartShelf shelf=new SmartShelf();
        int choice;

        // Menu driven digital library kiosk
        do{
            System.out.println("\n1.Add Book\n2.Display Reading List\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter book title: ");
                    String title=sc.nextLine();
                    shelf.addBook(title);
                    break;
                case 2:
                    shelf.displayBooks();
                    break;
                case 0:
                    System.out.println("Kiosk closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
