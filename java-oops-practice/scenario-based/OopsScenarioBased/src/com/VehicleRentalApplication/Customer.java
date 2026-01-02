package com.VehicleRentalApplication;

//Customer class
class Customer{
  private String name;
  private int customerId;

  public Customer(int customerId,String name){
      this.customerId=customerId;
      this.name=name;
  }

  public String getName(){
      return name;
  }
  public int getCustomerId(){
      return customerId;
  }
}
