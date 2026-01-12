package com.TrainCompanion;
import java.util.Scanner;
// Test class for TrainCompanion system
public class TrainCompanionApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TrainRoute route=new TrainRoute();
        int choice;
        // Menu driven compartment navigation
        do{
            System.out.println("\n1.Add Compartment\n2.Move Next\n3.Move Previous\n4.Remove Compartment\n5.Show Adjacent\n6.Display Route\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter compartment name: ");
                    String name=sc.nextLine();
                    route.addCompartment(name);
                    break;
                case 2:
                    route.moveNext();
                    break;
                case 3:
                    route.movePrevious();
                    break;
                case 4:
                    System.out.print("Enter compartment to remove: ");
                    String remove=sc.nextLine();
                    route.removeCompartment(remove);
                    break;
                case 5:
                    route.showAdjacent();
                    break;
                case 6:
                    route.displayRoute();
                    break;
                case 0:
                    System.out.println("Journey ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
