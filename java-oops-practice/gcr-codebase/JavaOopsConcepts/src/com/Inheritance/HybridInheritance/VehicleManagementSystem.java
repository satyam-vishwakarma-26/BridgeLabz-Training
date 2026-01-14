package com.Inheritance.HybridInheritance;

//Main class
public class VehicleManagementSystem{
  public static void main(String[] args){
      Vehicle v1=new ElectricVehicle(150,"Tesla Model 3",75);
      Vehicle v2=new PetrolVehicle(180,"Honda City",40);

      v1.displayInfo();
      ((ElectricVehicle)v1).charge();
      System.out.println("-----");
      v2.displayInfo();
      ((PetrolVehicle)v2).refuel();
  }
}
