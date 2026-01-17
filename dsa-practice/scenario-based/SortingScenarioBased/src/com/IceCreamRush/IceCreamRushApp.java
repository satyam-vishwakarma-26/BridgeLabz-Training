package com.IceCreamRush;
import java.util.Scanner;

// Test class for IceCreamRush system
public class IceCreamRushApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        IceCreamRushManager manager=new IceCreamRushManager();
        int choice;

        // Menu driven ice cream popularity system
        do{
            System.out.println("\n1.Add Flavor Sales\n2.Display Flavors\n3.Sort by Popularity\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter flavor name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter sold count: ");
                    int count=sc.nextInt();
                    manager.addFlavor(name,count);
                    break;
                case 2:
                    manager.displayFlavors();
                    break;
                case 3:
                    manager.sortByPopularity();
                    break;
                case 0:
                    System.out.println("Weekly report closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
