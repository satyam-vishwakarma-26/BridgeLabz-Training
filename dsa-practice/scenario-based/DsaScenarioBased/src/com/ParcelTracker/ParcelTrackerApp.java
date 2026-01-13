package com.ParcelTracker;
import java.util.Scanner;

// Test class for ParcelTracker system
public class ParcelTrackerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ParcelTracker tracker=new ParcelTracker();
        int choice;

        // Menu driven parcel tracking system
        do{
            System.out.println("\n1.Initialize Tracking\n2.Track Parcel\n3.Add Checkpoint\n4.Mark Parcel Lost\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
        
            switch(choice){
                case 1:
                    tracker.initializeStages();
                    System.out.println("Tracking initialized");
                    break;
                case 2:
                    tracker.trackParcel();
                    break;
                case 3:
                    System.out.print("Enter existing stage: ");
                    String after=sc.nextLine();
                    System.out.print("Enter new checkpoint: ");
                    String newStage=sc.nextLine();
                    tracker.addCheckpoint(after,newStage);
                    break;
                case 4:
                    tracker.markParcelLost();
                    break;
                case 0:
                    System.out.println("Tracking closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
