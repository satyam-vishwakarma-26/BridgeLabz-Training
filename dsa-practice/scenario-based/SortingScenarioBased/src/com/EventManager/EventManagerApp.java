package com.EventManager;
import java.util.Scanner;

// Test class for EventManager system
public class EventManagerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EventManager manager=new EventManager();
        int choice;
     
        // Menu driven ticket optimizer
        do{
            System.out.println("\n1.Add Ticket\n2.Display All Tickets\n3.Sort Tickets\n4.Show Cheapest Tickets\n5.Show Expensive Tickets\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter ticket price: ");
                    double price=sc.nextDouble();
                    manager.addTicket(price);
                    break;
                case 2:
                    manager.displayTickets();
                    break;
                case 3:
                    manager.sortTickets();
                    break;
                case 4:
                    System.out.print("How many cheapest tickets?: ");
                    int c=sc.nextInt();
                    manager.displayTop(c,true);
                    break;
                case 5:
                    System.out.print("How many expensive tickets?: ");
                    int e=sc.nextInt();
                    manager.displayTop(e,false);
                    break;
                case 0:
                    System.out.println("Event system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
