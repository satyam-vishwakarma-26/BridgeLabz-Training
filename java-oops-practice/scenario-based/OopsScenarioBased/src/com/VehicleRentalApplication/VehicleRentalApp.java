package com.VehicleRentalApplication;

import java.util.ArrayList;

//Main class
public class VehicleRentalApp{
  public static void main(String[] args){

      Customer c1=new Customer(101,"Rohan");

      //list of vehicles (polymorphism)
      ArrayList<Vehicle> vehicles=new ArrayList<>();
      vehicles.add(new Bike("BIKE101",200));
      vehicles.add(new Car("CAR202",800));
      vehicles.add(new Truck("TRUCK303",1500));

      int days=3;

      System.out.println("Customer: "+c1.getName());
      System.out.println("Rental Duration: "+days+" days\n");

      //polymorphic rent calculation
      for(Vehicle v:vehicles){
          v.displayVehicle();
          double rent=v.calculateRent(days);
          System.out.println("Total Rent: ₹"+rent);
          System.out.println("---------------------------");
      }
  }
}
