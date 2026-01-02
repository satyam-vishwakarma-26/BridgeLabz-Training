package com.encapsulation.RideHailingApplication;

//Bike class
class Bike extends Vehicle implements GPS{
  private String location="Unknown";

  public Bike(int vehicleId,String driverName){
      super(vehicleId,driverName,8);
  }

  public double calculateFare(double distance){
      return distance*getRatePerKm();
  }

  public void getCurrentLocation(){
      System.out.println("Bike current location: "+location);
  }

  public void updateLocation(String location){
      this.location=location;
  }
}
