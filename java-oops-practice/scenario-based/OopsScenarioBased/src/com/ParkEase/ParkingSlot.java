package com.ParkEase;
public class ParkingSlot{
    private int slotId;
    private String vehicleTypeAllowed;
    private boolean isOccupied;

	//constructor for object variable initialization
    public ParkingSlot(int slotId,String vehicleTypeAllowed){
        this.slotId=slotId;
        this.vehicleTypeAllowed=vehicleTypeAllowed;
        this.isOccupied=false;
    }

    public int getSlotId(){
        return slotId;
    }

    public String getVehicleTypeAllowed(){
        return vehicleTypeAllowed;
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    //controlled access
    public void occupy(){
        isOccupied=true;
    }

    public void free(){
        isOccupied=false;
    }

    public void showSlot(){
        System.out.println("Slot ID: "+slotId+
                " | Type: "+vehicleTypeAllowed+
                " | Available: "+(!isOccupied));
    }
}
