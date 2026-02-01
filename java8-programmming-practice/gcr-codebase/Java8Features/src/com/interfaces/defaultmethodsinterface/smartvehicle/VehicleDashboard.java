package com.interfaces.defaultmethodsinterface.smartvehicle;
public interface VehicleDashboard {

    void displaySpeed(int speed);

    // New feature added later
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available for this vehicle");
    }
}