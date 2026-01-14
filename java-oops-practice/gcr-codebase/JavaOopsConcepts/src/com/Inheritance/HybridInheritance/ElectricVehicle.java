package com.Inheritance.HybridInheritance;

//ElectricVehicle subclass
class ElectricVehicle extends Vehicle{
  int batteryCapacity;

  ElectricVehicle(int maxSpeed,String model,int batteryCapacity){
      super(maxSpeed,model);
      this.batteryCapacity=batteryCapacity;
  }

  void charge(){
      System.out.println("Charging electric vehicle");
  }
}
