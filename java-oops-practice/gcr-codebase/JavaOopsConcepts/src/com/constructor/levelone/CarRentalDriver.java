package com.constructor.levelone;

public class CarRentalDriver {

    public static void main(String[] args) {

        // default rental
        CarRental r1 = new CarRental();
        r1.display();

        System.out.println("-----");

        // custom rental
        CarRental r2 = new CarRental("Satyam", "Sedan", 3, 1500);
        r2.display();
    }
}

