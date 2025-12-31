package com.Inheritance.SingleInheritance;

//Subclass
class Thermostat extends Device{
int temperatureSetting;

Thermostat(String deviceId,boolean status,int temperatureSetting){
    super(deviceId,status);
    this.temperatureSetting=temperatureSetting;
}

@Override
void displayStatus(){
    super.displayStatus();
    System.out.println("Temperature: "+temperatureSetting+"°C");
}
}
