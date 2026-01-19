package com.FitnessTracker;
import java.util.Scanner;

// Test class for FitnessTracker system
public class FitnessTrackerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FitnessTrackerManager manager=new FitnessTrackerManager();
        int choice;

        // Menu driven fitness leaderboard system
        do{
            System.out.println("\n1.Add User Steps\n2.Sort Leaderboard\n3.Display Leaderboard\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter user name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter steps: ");
                    int steps=sc.nextInt();
                    manager.addUser(name,steps);
                    break;
                case 2:
                    manager.sortLeaderboard();
                    break;
                case 3:
                    manager.displayLeaderboard();
                    break;
                case 0:
                    System.out.println("Fitness tracker closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
