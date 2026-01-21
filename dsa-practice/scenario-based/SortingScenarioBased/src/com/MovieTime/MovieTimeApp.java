package com.MovieTime;
import java.util.Scanner;

// Test class for MovieTime system
public class MovieTimeApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MovieTimeManager manager=new MovieTimeManager();
        int choice;

        // Menu driven theater show system
        do{
            System.out.println("\n1.Add Show\n2.Display Shows\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter movie name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter show time (HHMM): ");
                    int time=sc.nextInt();
                    manager.addShow(name,time);
                    break;
                case 2:
                    manager.displayShows();
                    break;
                case 0:
                    System.out.println("MovieTime closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
