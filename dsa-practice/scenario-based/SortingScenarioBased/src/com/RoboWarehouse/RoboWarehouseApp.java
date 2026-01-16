package com.RoboWarehouse;
import java.util.Scanner;
// Test class for RoboWarehouse system
public class RoboWarehouseApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        RoboShelf shelf=new RoboShelf();
        int choice;
        // Menu driven robot shelf loading system
        do{
            System.out.println("\n1.Add Package\n2.Display Shelf\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter package weight: ");
                    double weight=sc.nextDouble();
                    shelf.addPackage(weight);
                    break;
                case 2:
                    shelf.displayShelf();
                    break;
                case 0:
                    System.out.println("Robot shutdown");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
