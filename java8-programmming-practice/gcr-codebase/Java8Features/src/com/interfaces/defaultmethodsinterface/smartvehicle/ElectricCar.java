package com.interfaces.defaultmethodsinterface.smartvehicle;
public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Level: 78%");
    }
}