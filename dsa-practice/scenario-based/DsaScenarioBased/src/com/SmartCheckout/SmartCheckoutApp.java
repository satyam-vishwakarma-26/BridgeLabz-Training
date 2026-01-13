package com.SmartCheckout;
import java.util.*;

// Test class for SmartCheckout system
public class SmartCheckoutApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SmartCheckoutManager manager=new SmartCheckoutManager();
        int choice;

        // Menu driven supermarket billing system
        do{
            System.out.println("\n1.Add Item\n2.Add Customer\n3.Process Customer\n4.Display Inventory\n5.Display Queue\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
        
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName=sc.nextLine();
                    System.out.print("Enter price: ");
                    double price=sc.nextDouble();
                    System.out.print("Enter stock: ");
                    int stock=sc.nextInt();
                    manager.addItem(itemName,price,stock);
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    String custName=sc.nextLine();
                    System.out.print("Enter number of items: ");
                    int n=sc.nextInt();
                    sc.nextLine();
                    List<String> items=new ArrayList<>();
                    for(int i=0;i<n;i++){
                        System.out.print("Enter item "+(i+1)+": ");
                        items.add(sc.nextLine());
                    }
                    manager.addCustomer(custName,items);
                    break;
                case 3:
                    manager.processCustomer();
                    break;
                case 4:
                    manager.displayInventory();
                    break;
                case 5:
                    manager.displayQueue();
                    break;
                case 0:
                    System.out.println("Checkout closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
