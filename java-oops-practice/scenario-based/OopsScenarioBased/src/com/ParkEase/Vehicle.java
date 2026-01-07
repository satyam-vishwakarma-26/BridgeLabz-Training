package com.ParkEase;
public abstract class Vehicle implements IPayable{
    protected String vehicleNumber;
    protected double baseRate;

	//constructor for object variable initialization
    public Vehicle(String vehicleNumber,double baseRate){
        this.vehicleNumber=vehicleNumber;
        this.baseRate=baseRate;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }
}
