package com.ParkEase;
import java.util.ArrayList;

public class ParkingManager{

	//list for storing the bookiglosgs and slots 
    private ArrayList<String> bookingLogs=new ArrayList<>();
    private ArrayList<ParkingSlot> slots=new ArrayList<>();

    //method for add slot 
    public void addSlot(ParkingSlot slot){
        slots.add(slot);
    }

    //method to show the slots 
    public void showSlots(){
        for(ParkingSlot s:slots){
            s.showSlot();
        }
    }

    //logic for assigning the slots 
    public ParkingSlot assignSlot(String vehicleType){
        for(ParkingSlot s:slots){
            if(s.isAvailable() &&
               s.getVehicleTypeAllowed().equalsIgnoreCase(vehicleType)){
                s.occupy();
                bookingLogs.add("Slot "+s.getSlotId()+" booked for "+vehicleType);
                return s;
            }
        }
        return null;
    }

    public void releaseSlot(ParkingSlot slot){
        slot.free();
        bookingLogs.add("Slot "+slot.getSlotId()+" released");
    }

    //logs exposed safely
    public void showLogs(){
        System.out.println("\n--- Parking Logs ---");
        for(String log:bookingLogs){
            System.out.println(log);
        }
    }
}
