package com.ArtExpo;
import java.util.Scanner;

// Test class for ArtExpo system
public class ArtExpoApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArtExpoManager manager=new ArtExpoManager();
        int choice;

        // Menu driven artist registration system
        do{
            System.out.println("\n1.Register Artist\n2.Display Artists\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter artist name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter registration time (HHMM): ");
                    int time=sc.nextInt();
                    manager.registerArtist(name,time);
                    break;
                case 2:
                    manager.displayArtists();
                    break;
                case 0:
                    System.out.println("ArtExpo closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
