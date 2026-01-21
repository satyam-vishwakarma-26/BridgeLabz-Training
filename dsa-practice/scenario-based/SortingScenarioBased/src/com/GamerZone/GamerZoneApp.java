package com.GamerZone;
import java.util.Scanner;

// Test class for GamerZone system
public class GamerZoneApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        GamerZoneManager manager=new GamerZoneManager();
        int choice;

        // Menu driven leaderboard system
        do{
            System.out.println("\n1.Add Player\n2.Sort Leaderboard\n3.Display Leaderboard\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter player name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter score: ");
                    int score=sc.nextInt();
                    manager.addPlayer(name,score);
                    break;
                case 2:
                    manager.sortLeaderboard();
                    break;
                case 3:
                    manager.displayLeaderboard();
                    break;
                case 0:
                    System.out.println("GamerZone closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
