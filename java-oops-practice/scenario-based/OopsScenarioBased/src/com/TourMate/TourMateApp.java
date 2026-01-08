package com.TourMate;
import java.util.Scanner;

public class TourMateApp{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("=== Welcome to TourMate ===");

        //trip type
        System.out.println("Choose Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");
        int tripChoice=sc.nextInt();
        sc.nextLine();

        //basic details
        System.out.print("Enter Destination: ");
        String destination=sc.nextLine();

        System.out.print("Enter Duration (days): ");
        int duration=sc.nextInt();
        sc.nextLine();

        //transport
        System.out.print("Enter Transport Mode: ");
        String mode=sc.nextLine();

        System.out.print("Enter Transport Cost: ");
        double tCost=sc.nextDouble();
        sc.nextLine();

        Transport transport=new Transport(mode,tCost);

        //hotel
        System.out.print("Enter Hotel Name: ");
        String hName=sc.nextLine();

        System.out.print("Enter Hotel Cost: ");
        double hCost=sc.nextDouble();
        sc.nextLine();

        Hotel hotel=new Hotel(hName,hCost);

        //activity
        System.out.print("Enter Activity Name: ");
        String aName=sc.nextLine();

        System.out.print("Enter Activity Cost: ");
        double aCost=sc.nextDouble();

        Activity activity=new Activity(aName,aCost);

        Trip trip;
        if(tripChoice==1){
            trip=new DomesticTrip(destination,duration,transport,hotel,activity);
        }else{
            trip=new InternationalTrip(destination,duration,transport,hotel,activity);
        }

        //output
        trip.showTripDetails();

        System.out.print("\nConfirm Booking? (yes/no): ");
        String confirm=sc.next();

        if(confirm.equalsIgnoreCase("yes")){
            trip.bookTrip();
        }else{
            System.out.println("Booking cancelled ❌");
        }
    }
}
