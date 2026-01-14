package com.ParkEase;
public class Truck extends Vehicle{

	//constructor for object variable initialization
    public Truck(String vehicleNumber){
        super(vehicleNumber,80); //₹80 per hour
    }

    @Override
    public double calculateCharges(int hours){
        double amount=baseRate*hours;
        if(hours>5){
            amount+=200;
        }
        return amount;
    }
}
