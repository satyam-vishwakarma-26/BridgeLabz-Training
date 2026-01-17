package com.FleetManager;

// Represents a vehicle needing maintenance
public class Vehicle{
    String vehicleId;
    int mileage;
    public Vehicle(String vehicleId,int mileage){
        this.vehicleId=vehicleId;
        this.mileage=mileage;
    }

    // Display vehicle details
    public void display(){
        System.out.println(vehicleId+" | Mileage: "+mileage);
    }
}
