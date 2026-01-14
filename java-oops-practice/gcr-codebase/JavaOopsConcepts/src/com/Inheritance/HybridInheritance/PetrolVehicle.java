package com.Inheritance.HybridInheritance;

//PetrolVehicle subclass
class PetrolVehicle extends Vehicle implements Refuelable{
  int fuelTankCapacity;

  PetrolVehicle(int maxSpeed,String model,int fuelTankCapacity){
      super(maxSpeed,model);
      this.fuelTankCapacity=fuelTankCapacity;
  }

  @Override
  public void refuel(){
      System.out.println("Refueling petrol vehicle");
  }
}
