package com.constructor.levelone;

public class Vehicle {

    // instance variables
    public String ownerName;
    public String vehicleType;

    // class variable (shared)
    public static double registrationFee = 1500;

    // constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

