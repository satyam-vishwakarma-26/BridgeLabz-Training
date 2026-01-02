package com.encapsulation.VehicleRentalSystem;

import java.util.ArrayList;

//main class
public class VehicleRentalSystem{
  public static void main(String[] args){

      ArrayList<Vehicle> vehicles=new ArrayList<>();

      //vehicles.add(new Car("MP09CAR123",1500));
      vehicles.add(new Bike("MP09BIKE456",500));
      vehicles.add(new Truck("MP09TRUCK789",3000));

      int days=3;

      //polymorphism in action
      for(Vehicle v:vehicles){
          System.out.println("\n----- Vehicle Details -----");
          v.showDetails();

          double rent=v.calculateRentalCost(days);
          System.out.println("Rental Cost for "+days+" days: ₹"+rent);

          Insurable ins=(Insurable)v;
          System.out.println("Insurance Cost: ₹"+ins.calculateInsurance(days));
          System.out.println("Insurance Policy: "+ins.getInsuranceDetails());
      }
  }
}
