package com.generics.smartwarehouse;
import java.util.Scanner;
// Test class for Smart Warehouse system with user input
public class SmartWarehouseApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Storage<Electronics> electronicsStorage=new Storage<>();
        Storage<Groceries> groceryStorage=new Storage<>();
        Storage<Furniture> furnitureStorage=new Storage<>();
        int choice;
        do{
            System.out.println("\n1.Add Electronics\n2.Add Groceries\n3.Add Furniture\n4.Display Electronics\n5.Display Groceries\n6.Display Furniture\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter Electronics ID: ");
                    String eid=sc.nextLine();
                    System.out.print("Enter Electronics Name: ");
                    String ename=sc.nextLine();
                    electronicsStorage.addItem(new Electronics(eid,ename));
                    break;
                case 2:
                    System.out.print("Enter Grocery ID: ");
                    String gid=sc.nextLine();
                    System.out.print("Enter Grocery Name: ");
                    String gname=sc.nextLine();
                    groceryStorage.addItem(new Groceries(gid,gname));
                    break;
                case 3:
                    System.out.print("Enter Furniture ID: ");
                    String fid=sc.nextLine();
                    System.out.print("Enter Furniture Name: ");
                    String fname=sc.nextLine();
                    furnitureStorage.addItem(new Furniture(fid,fname));
                    break;
                case 4:
                    System.out.println("--- Electronics Storage ---");
                    WarehouseUtil.displayAll(electronicsStorage.getItems());
                    break;
                case 5:
                    System.out.println("--- Grocery Storage ---");
                    WarehouseUtil.displayAll(groceryStorage.getItems());
                    break;
                case 6:
                    System.out.println("--- Furniture Storage ---");
                    WarehouseUtil.displayAll(furnitureStorage.getItems());
                    break;
                case 0:
                    System.out.println("Warehouse system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
