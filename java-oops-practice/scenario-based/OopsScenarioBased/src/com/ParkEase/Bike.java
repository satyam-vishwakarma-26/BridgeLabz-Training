package com.ParkEase;
public class Bike extends Vehicle{

	//constructor for object variable initialization
    public Bike(String vehicleNumber){
        super(vehicleNumber,30); //₹30 per hour
    }

    @Override
    public double calculateCharges(int hours){
        double amount=baseRate*hours;
        if(hours>5){
            amount+=50;
        }
        return amount;
    }
}
