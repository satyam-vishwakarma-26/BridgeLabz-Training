package com.AmbulanceRoute;
import java.util.Scanner;
// Test class to simulate ambulance routing with user input
public class AmbulanceRouteApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AmbulanceRoute route=new AmbulanceRoute();
        int choice;
        // Menu driven ambulance routing
        do{
            System.out.println("\n1.Add Unit\n2.Find Available Unit\n3.Remove Unit\n4.Display Units\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter unit name: ");
                    String name=sc.nextLine();
                    System.out.print("Is unit available (true/false): ");
                    boolean available=sc.nextBoolean();
                    route.addUnit(name,available);
                    break;
                case 2:
                    route.findAvailableUnit();
                    break;
                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String removeName=sc.nextLine();
                    route.removeUnit(removeName);
                    break;
                case 4:
                    route.displayUnits();
                    break;
                case 0:
                    System.out.println("System closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
