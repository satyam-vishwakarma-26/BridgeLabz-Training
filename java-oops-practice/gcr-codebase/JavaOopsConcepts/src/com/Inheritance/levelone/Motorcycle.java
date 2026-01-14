package com.Inheritance.levelone;

//it is a subclass of vehicle 
class Motorcycle extends Vehicle{
	  boolean hasCarrier;

	  Motorcycle(int maxSpeed,String fuelType,boolean hasCarrier){
	      super(maxSpeed,fuelType);
	      this.hasCarrier=hasCarrier;
	  }

	  @Override
	  void displayInfo(){
	      super.displayInfo();
	      System.out.println("Carrier: "+hasCarrier);
	  }
	}
