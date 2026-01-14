package com.encapsulation.RideHailingApplication;


//abstract Vehicle class
abstract class Vehicle{
  private int vehicleId;
  private String driverName;
  private double ratePerKm;

  //constructor
  public Vehicle(int vehicleId,String driverName,double ratePerKm){
      this.vehicleId=vehicleId;
      this.driverName=driverName;
      this.ratePerKm=ratePerKm;
  }

  //getters
  public int getVehicleId(){
      return vehicleId;
  }
  public String getDriverName(){
      return driverName;
  }
  public double getRatePerKm(){
      return ratePerKm;
  }

  //setters
  public void setDriverName(String driverName){
      this.driverName=driverName;
  }

  //concrete method
  public void getVehicleDetails(){
      System.out.println("Vehicle ID: "+vehicleId);
      System.out.println("Driver Name: "+driverName);
      System.out.println("Rate per Km: ₹"+ratePerKm);
  }

  //abstract method
  public abstract double calculateFare(double distance);
}
