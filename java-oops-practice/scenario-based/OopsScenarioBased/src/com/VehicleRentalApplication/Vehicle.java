package com.VehicleRentalApplication;

//abstract Vehicle class
abstract class Vehicle implements Rentable{
  protected String vehicleNumber;
  protected String type;
  protected double baseRate;

  //constructor
  public Vehicle(String vehicleNumber,String type,double baseRate){
      this.vehicleNumber=vehicleNumber;
      this.type=type;
      this.baseRate=baseRate;
  }

  //getters
  public String getVehicleNumber(){
      return vehicleNumber;
  }
  public String getType(){
      return type;
  }
  public double getBaseRate(){
      return baseRate;
  }

  //display vehicle details
  public void displayVehicle(){
      System.out.println("Vehicle No: "+vehicleNumber+
                         ", Type: "+type+
                         ", Base Rate: "+baseRate);
  }
}

