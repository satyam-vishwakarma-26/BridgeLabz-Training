package com.encapsulation.VehicleRentalSystem;


//abstract vehicle class
abstract class Vehicle{
  private String vehicleNumber;
  private String type;
  private double rentalRate;

  //constructor
  public Vehicle(String vehicleNumber,String type,double rentalRate){
      this.vehicleNumber=vehicleNumber;
      this.type=type;
      this.rentalRate=rentalRate;
  }

  //getters
  public String getVehicleNumber(){
      return vehicleNumber;
  }
  public String getType(){
      return type;
  }
  public double getRentalRate(){
      return rentalRate;
  }

  //abstract method
  public abstract double calculateRentalCost(int days);

  //display details
  public void showDetails(){
      System.out.println("Vehicle No: "+vehicleNumber);
      System.out.println("Type: "+type);
      System.out.println("Rate per day: ₹"+rentalRate);
  }
}
