package com.VehicleRentalApplication;

//Car class
class Car extends Vehicle{
  public Car(String vehicleNumber,double baseRate){
      super(vehicleNumber,"Car",baseRate);
  }
  //rent calculation with surcharge
  public double calculateRent(int days){
      return (baseRate*days)+500; //fixed service charge
  }
}

