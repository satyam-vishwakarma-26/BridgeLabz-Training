package com.Inheritance.levelone;

//Driver class
public class VehicleTransportSystem{
	  public static void main(String[] args){
	      Vehicle[] vehicles={
	          new Car(180,"Petrol",5),
	          new Truck(120,"Diesel",10.5),
	          new Motorcycle(160,"Petrol",true)
	      };

	      for(Vehicle v:vehicles){
	          v.displayInfo();
	          System.out.println("-----");
	      }
	  }
	}
