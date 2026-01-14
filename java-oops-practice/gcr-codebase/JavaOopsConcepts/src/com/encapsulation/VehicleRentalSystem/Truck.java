package com.encapsulation.VehicleRentalSystem;

//Truck class
class Truck extends Vehicle implements Insurable{
  private String insurancePolicy="TRUCK-INS-303";

  public Truck(String vehicleNumber,double rentalRate){
      super(vehicleNumber,"Truck",rentalRate);
  }

  public double calculateRentalCost(int days){
      return getRentalRate()*days*1.5;
  }

  public double calculateInsurance(int days){
      return days*300;
  }

  public String getInsuranceDetails(){
      return insurancePolicy;
  }
}
