package com.TailorShop;
import java.util.Scanner;

// Test class for TailorShop system
public class TailorShopApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TailorShopManager manager=new TailorShopManager();
        int choice;

        // Menu driven tailor shop system
        do{
            System.out.println("\n1.Add Order\n2.Display Orders\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter customer name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter delivery deadline (days): ");
                    int deadline=sc.nextInt();
                    manager.addOrder(name,deadline);
                    break;
                case 2:
                    manager.displayOrders();
                    break;
                case 0:
                    System.out.println("TailorShop closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
