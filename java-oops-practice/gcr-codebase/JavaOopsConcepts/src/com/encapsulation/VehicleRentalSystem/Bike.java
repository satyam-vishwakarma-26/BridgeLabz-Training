package com.encapsulation.VehicleRentalSystem;

//Bike class
class Bike extends Vehicle implements Insurable{
  private String insurancePolicy="BIKE-INS-202";

  public Bike(String vehicleNumber,double rentalRate){
      super(vehicleNumber,"Bike",rentalRate);
  }

  public double calculateRentalCost(int days){
      return getRentalRate()*days;
  }

  public double calculateInsurance(int days){
      return days*100;
  }

  public String getInsuranceDetails(){
      return insurancePolicy;
  }
}

