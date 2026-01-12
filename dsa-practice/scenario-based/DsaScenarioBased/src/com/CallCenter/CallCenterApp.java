package com.CallCenter;
import java.util.Scanner;

// Test class for Call Center system
public class CallCenterApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //creating callcentermanager object 
        CallCenterManager manager=new CallCenterManager();
        int choice;
        
        // Menu driven call center system
        do{
            System.out.println("\n1.Add Call\n2.Serve Call\n3.Display Queues\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                     System.out.print("Enter customer name: ");
                    String name=sc.nextLine();
                     System.out.print("Is VIP (true/false): ");
                    boolean vip=sc.nextBoolean();
                    manager.addCall(name,vip);
                    break;
               case 2:
                     manager.serveCall();
                     break;
                case 3:
                    manager.displayQueues();
                     break;
                case 0:
                    System.out.println("Call Center closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
