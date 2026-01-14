package com.HomeNest;
// Test class for HomeNest system
public class HomeNestApp{
    public static void main(String[] args){
      
    	Device light=new Light("Light-101");
        Device camera=new Camera("Cam-201");
        Device thermostat=new Thermostat("Thermo-301");
        Device lock=new Lock("Lock-401");
        light.turnOn();
        camera.turnOn();
        thermostat.turnOn();
        lock.turnOn();
        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();
        System.out.println("Light Energy (5h): "+light.calculateEnergy(5));
        System.out.println("Camera Energy (3h): "+camera.calculateEnergy(3));
    }
}
