package com.FoodLoop;
import java.util.Scanner;

public class FoodLoopApp{
    public static void main(String[] args){

    	//Creating scanner object 
        Scanner sc=new Scanner(System.in);
        FoodMenu menu=new FoodMenu();
        Order order=new Order();

        System.out.println("=== Welcome to FoodLoop 🍽️ ===");

        while(true){
            System.out.println("\n1. View Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    menu.showMenu();
                    break;

                case 2:
                    menu.showMenu();
                    System.out.print("Enter item number: ");
                    int itemNo=sc.nextInt();
                    FoodItem item=menu.getItem(itemNo-1);
                    if(item!=null){
                        order.addItem(item);
                    }else{
                        System.out.println("Invalid choice");
                    }
                    break;

                case 3:
                    order.placeOrder();
                    break;

                case 4:
                    order.cancelOrder();
                    break;

                case 5:
                    System.out.println("Thank you for using FoodLoop 🍔");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
