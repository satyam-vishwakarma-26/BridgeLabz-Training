package com.FlashDealz;
import java.util.Scanner;

// Test class for FlashDealz system
public class FlashDealzApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlashDealzManager manager=new FlashDealzManager();
        int choice;

        // Menu driven flash sale system
        do{
            System.out.println("\n1.Add Product\n2.Display Products\n3.Sort by Discount\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter product name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter discount percentage: ");
                    double discount=sc.nextDouble();
                    manager.addProduct(name,discount);
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    manager.sortByDiscount();
                    break;
                case 0:
                    System.out.println("Flash sale closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
