package com.interfaces.defaultmethodsinterface.smartvehicle;
public class DashboardApp {
    public static void main(String[] args) {

        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar();

        petrolCar.displaySpeed(90);
        petrolCar.displayBatteryPercentage();

        electricCar.displaySpeed(100);
        electricCar.displayBatteryPercentage();
    }
}