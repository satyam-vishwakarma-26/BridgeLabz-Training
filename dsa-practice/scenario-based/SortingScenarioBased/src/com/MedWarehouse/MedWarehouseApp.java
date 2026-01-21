package com.MedWarehouse;
import java.util.Scanner;

// Test class for MedWarehouse system
public class MedWarehouseApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MedWarehouseManager manager=new MedWarehouseManager();
        int choice;

        // Menu driven medicine warehouse system
        do{
            System.out.println("\n1.Add Medicine\n2.Sort by Expiry\n3.Display Medicines\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter medicine name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter expiry (in days): ");
                    int days=sc.nextInt();
                    manager.addMedicine(name,days);
                    break;
                case 2:
                    manager.sortByExpiry();
                    break;
                case 3:
                    manager.displayMedicines();
                    break;
                case 0:
                    System.out.println("MedWarehouse closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
