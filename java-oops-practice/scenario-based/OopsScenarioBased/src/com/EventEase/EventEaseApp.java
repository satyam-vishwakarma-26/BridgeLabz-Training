package com.EventEase;

import java.util.Scanner;

public class EventEaseApp{
    public static void main(String[] args){
    	
    	//Creating Scanner object 
        Scanner sc=new Scanner(System.in);

        // Organizer 
        System.out.println("Enter Organizer Details");
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Email: ");
        String email=sc.nextLine();
        User user=new User(name,email);

        // Event Choice
        System.out.println("\nChoose Event Type");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int choice=sc.nextInt();

        System.out.print("Event ID: ");
        int id=sc.nextInt();
        sc.nextLine();

        System.out.print("Location: ");
        String location=sc.nextLine();

        System.out.print("Date: ");
        String date=sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees=sc.nextInt();

        System.out.print("Venue Cost: ");
        double venueCost=sc.nextDouble();

        System.out.print("Service Cost (Catering/Decoration): ");
        double serviceCost=sc.nextDouble();

        System.out.print("Discount: ");
        double discount=sc.nextDouble();

        Event event;
        if(choice==1){
            event=new BirthdayEvent(id,location,date,attendees,
                                    venueCost,serviceCost,discount);
        }else{
            event=new ConferenceEvent(id,location,date,attendees,
                                      venueCost,serviceCost,discount);
        }

        //Showing  Output 
        System.out.println("\n--- Organizer ---");
        user.showUser();

        System.out.println("\n--- Event Details ---");
        event.showEvent();
        event.schedule();

        // Reschedule functionality 
        System.out.print("\nDo you want to reschedule? (yes/no): ");
        sc.nextLine();
        String ans=sc.nextLine();

        if(ans.equalsIgnoreCase("yes")){
            System.out.print("Enter new date: ");
            String newDate=sc.nextLine();
            event.reschedule(newDate);
        }

        System.out.println("\nThank you for using EventEase 🎉");
    }
}
