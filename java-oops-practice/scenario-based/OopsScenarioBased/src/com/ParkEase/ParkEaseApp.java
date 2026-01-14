package com.ParkEase;
import java.util.Scanner;

public class ParkEaseApp{
    public static void main(String[] args){

    	//Creating the scanner object and taking the user inputs 
        Scanner sc=new Scanner(System.in);
        ParkingManager manager=new ParkingManager();

        //initialize slots
        manager.addSlot(new ParkingSlot(1,"Car"));
        manager.addSlot(new ParkingSlot(2,"Bike"));
        manager.addSlot(new ParkingSlot(3,"Truck"));
        manager.addSlot(new ParkingSlot(4,"Car"));

        while(true){
            System.out.println("\n--- ParkEase System ---");
            System.out.println("1. View Slots");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice=sc.nextInt();

            if(choice==1){
                manager.showSlots();
            }
            else if(choice==2){
                System.out.println("Vehicle Type (Car/Bike/Truck): ");
                String type=sc.next();

                System.out.print("Vehicle Number: ");
                String number=sc.next();

                System.out.print("Parking Hours: ");
                int hours=sc.nextInt();

                Vehicle vehicle;
                if(type.equalsIgnoreCase("Car")){
                    vehicle=new Car(number);
                }else if(type.equalsIgnoreCase("Bike")){
                    vehicle=new Bike(number);
                }else{
                    vehicle=new Truck(number);
                }

                ParkingSlot slot=manager.assignSlot(type);

                if(slot!=null){
                    double charges=vehicle.calculateCharges(hours);
                    System.out.println("Slot Assigned: "+slot.getSlotId());
                    System.out.println("Total Charges: ₹"+charges);
                    manager.releaseSlot(slot);
                }else{
                    System.out.println("No slot available for "+type);
                }
            }
            else{
                manager.showLogs();
                System.out.println("Thank you for using ParkEase 🚗");
                break;
            }
        }
    }
}
