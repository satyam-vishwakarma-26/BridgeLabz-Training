package com.CinemaHouse;
import java.util.Scanner;
// Test class for CinemaHouse system
public class CinemaHouseApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CinemaHouseManager manager=new CinemaHouseManager();
        int choice;
        // Menu driven cinema scheduling system
        do{
            System.out.println("\n1.Add Movie Show\n2.Display Shows\n3.Sort Shows\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter movie name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter show time (24hr, e.g., 1830): ");
                    int time=sc.nextInt();
                    manager.addShow(name,time);
                    break;
                case 2:
                    manager.displayShows();
                    break;
                case 3:
                    manager.sortShows();
                    break;
                case 0:
                    System.out.println("Cinema closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
