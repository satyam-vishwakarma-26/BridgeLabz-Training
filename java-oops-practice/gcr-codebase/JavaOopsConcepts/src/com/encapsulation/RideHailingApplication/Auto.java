package com.encapsulation.RideHailingApplication;

//Auto class
class Auto extends Vehicle implements GPS{
  private String location="Unknown";

  public Auto(int vehicleId,String driverName){
      super(vehicleId,driverName,10);
  }

  public double calculateFare(double distance){
      return distance*getRatePerKm();
  }

  public void getCurrentLocation(){
      System.out.println("Auto current location: "+location);
  }

  public void updateLocation(String location){
      this.location=location;
  }
}
