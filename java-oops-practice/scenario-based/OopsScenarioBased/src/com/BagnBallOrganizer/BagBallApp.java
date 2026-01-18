package com.BagnBallOrganizer;
import java.util.Scanner;
// Test class for Bag-n-Ball Organizer
public class BagBallApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BagManager manager=new BagManager();
        int choice;
        // Menu driven toy storage system
        do{
            System.out.println("\n1.Add Bag\n2.Add Ball to Bag\n3.Remove Ball from Bag\n4.Display Balls in Bag\n5.Display All Bags\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter bag ID: ");
                    String bid=sc.nextLine();
                    System.out.print("Enter bag color: ");
                    String bcolor=sc.nextLine();
                    System.out.print("Enter bag capacity: ");
                    int cap=sc.nextInt();
                    manager.addBag(new Bag(bid,bcolor,cap));
                    break;
                case 2:
                    System.out.print("Enter bag ID: ");
                    String bagId=sc.nextLine();
                    Bag bag=manager.getBag(bagId);
                    if(bag!=null){
                        System.out.print("Enter ball ID: ");
                        String ballId=sc.nextLine();
                        System.out.print("Enter ball color: ");
                        String color=sc.nextLine();
                        System.out.print("Enter ball size(small/medium/large): ");
                        String size=sc.nextLine();
                        bag.addBall(new Ball(ballId,color,size));
                    }else{
                        System.out.println("Bag not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter bag ID: ");
                    String rbid=sc.nextLine();
                    Bag rbag=manager.getBag(rbid);
                    if(rbag!=null){
                        System.out.print("Enter ball ID to remove: ");
                        rbag.removeBall(sc.nextLine());
                    }else{
                        System.out.println("Bag not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter bag ID: ");
                    Bag dbag=manager.getBag(sc.nextLine());
                    if(dbag!=null){
                        dbag.displayBalls();
                    }else{
                        System.out.println("Bag not found");
                    }
                    break;
                case 5:
                    manager.displayAllBags();
                    break;
                case 0:
                    System.out.println("Toy storage system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
