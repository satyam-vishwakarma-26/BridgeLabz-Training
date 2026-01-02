package com.encapsulation.RideHailingApplication;

import java.util.*;


//Main class
public class RideHailingApp{
  public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

      //polymorphism
      Vehicle[] vehicles=new Vehicle[3];
      vehicles[0]=new Car(101,"Ravi");
      vehicles[1]=new Bike(102,"Amit");
      vehicles[2]=new Auto(103,"Suresh");

      System.out.print("Enter ride distance (km): ");
      double distance=sc.nextDouble();

      System.out.println("\n--- Fare Details ---");
      for(Vehicle v:vehicles){
          v.getVehicleDetails();
          System.out.println("Fare for "+distance+" km: ₹"+v.calculateFare(distance));
          System.out.println("-------------------");
      }
  }
}
