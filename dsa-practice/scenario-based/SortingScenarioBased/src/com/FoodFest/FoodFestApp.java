package com.FoodFest;
import java.util.Scanner;

// Test class for FoodFest system
public class FoodFestApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FoodFestManager manager=new FoodFestManager();
        int choice;

        // Menu driven food festival system
        do{
            System.out.println("\n1.Add Stall\n2.Generate Master List\n3.Display Stalls\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter stall name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter footfall: ");
                    int footfall=sc.nextInt();
                    manager.addStall(name,footfall);
                    break;
                case 2:
                    manager.generateMasterList();
                    break;
                case 3:
                    manager.displayStalls();
                    break;
                case 0:
                    System.out.println("FoodFest system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
