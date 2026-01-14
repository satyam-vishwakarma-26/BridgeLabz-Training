package com.VehicleRentalApplication;

//Bike class
class Bike extends Vehicle{
  public Bike(String vehicleNumber,double baseRate){
      super(vehicleNumber,"Bike",baseRate);
  }
  //rent calculation
  public double calculateRent(int days){
      return baseRate*days;
  }
}

