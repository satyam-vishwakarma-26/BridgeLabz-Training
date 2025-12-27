package com.constructor.levelone;

public class VehicleDriver {

    public static void main(String[] args) {

        // create vehicles
        Vehicle v1 = new Vehicle("Satyam", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Bike");

        // display details
        v1.displayVehicleDetails();
        System.out.println("-----");
        v2.displayVehicleDetails();

        System.out.println("-----");

        // update registration fee
        Vehicle.updateRegistrationFee(2000);

        // display again
        v1.displayVehicleDetails();
        System.out.println("-----");
        v2.displayVehicleDetails();
    }
}

