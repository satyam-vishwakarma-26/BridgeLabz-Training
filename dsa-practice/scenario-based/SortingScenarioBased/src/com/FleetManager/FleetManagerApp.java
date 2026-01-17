package com.FleetManager;
import java.util.Scanner;

// Test class for FleetManager system
public class FleetManagerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FleetManager manager=new FleetManager();
        int choice;

        // Menu driven maintenance scheduler
        do{
            System.out.println("\n1.Add Vehicle\n2.Generate Schedule\n3.Display Schedule\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter vehicle ID: ");
                    String id=sc.nextLine();
                    System.out.print("Enter mileage: ");
                    int mileage=sc.nextInt();
                    manager.addVehicle(id,mileage);
                    break;
                case 2:
                    manager.generateSchedule();
                    break;
                case 3:
                    manager.displaySchedule();
                    break;
                case 0:
                    System.out.println("Fleet system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
