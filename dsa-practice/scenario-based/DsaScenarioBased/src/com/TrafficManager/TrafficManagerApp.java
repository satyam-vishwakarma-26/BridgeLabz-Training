package com.TrafficManager;
import java.util.Scanner;

// Test class for TrafficManager system
public class TrafficManagerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TrafficManager manager=new TrafficManager();
        int choice;

        // Menu driven traffic system
        do{
            System.out.println("\n1.Add Vehicle to Queue\n2.Enter Roundabout\n3.Exit Roundabout\n4.Display Roundabout\n5.Display Queue\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
        
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String number=sc.nextLine();
                    manager.addToQueue(number);
                    break;
                case 2:
                    manager.enterRoundabout();
                    break;
                case 3:
                    System.out.print("Enter vehicle number to exit: ");
                    String exitNum=sc.nextLine();
                    manager.exitRoundabout(exitNum);
                    break;
                case 4:
                    manager.displayRoundabout();
                    break;
                case 5:
                    manager.displayQueue();
                    break;
                case 0:
                    System.out.println("Traffic system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
