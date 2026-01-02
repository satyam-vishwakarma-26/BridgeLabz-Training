package com.encapsulation.RideHailingApplication;

//Car class
class Car extends Vehicle implements GPS{
  private String location="Unknown";

  public Car(int vehicleId,String driverName){
      super(vehicleId,driverName,15);
  }

  public double calculateFare(double distance){
      return distance*getRatePerKm();
  }

  public void getCurrentLocation(){
      System.out.println("Car current location: "+location);
  }

  public void updateLocation(String location){
      this.location=location;
  }
}
