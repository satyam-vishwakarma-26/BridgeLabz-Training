package com.ParkEase;
public class Car extends Vehicle{

	//constructor for object variable initialization
    public Car(String vehicleNumber){
        super(vehicleNumber,50); //₹50 per hour
    }

    @Override
    public double calculateCharges(int hours){
        double amount=baseRate*hours;
        if(hours>5){
            amount+=100; //penalty
        }
        return amount;
    }
}
