package com.HomeNest;
// Test class for HomeNest system
public class HomeNestApp{
    public static void main(String[] args){
        Device light=new Light("Light-01");
        Device camera=new Camera("Camera-02");
        Device thermostat=new Thermostat("Thermo-03");
        Device lock=new Lock("Lock-04");
        light.turnOn();
        camera.turnOn();
        thermostat.turnOn();
        lock.turnOn();
        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();
        System.out.println("Light energy (6h): "+light.calculateEnergy(6));
        System.out.println("Camera energy (4h): "+camera.calculateEnergy(4));
    }
}
