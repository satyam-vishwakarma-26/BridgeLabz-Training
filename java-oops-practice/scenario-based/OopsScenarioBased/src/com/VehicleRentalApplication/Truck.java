package com.VehicleRentalApplication;

//Truck class
class Truck extends Vehicle{
  public Truck(String vehicleNumber,double baseRate){
      super(vehicleNumber,"Truck",baseRate);
  }
  //rent calculation with heavy vehicle surcharge
  public double calculateRent(int days){
      return (baseRate*days)+(days*300);
  }
}

