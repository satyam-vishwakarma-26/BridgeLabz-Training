package com.interfaces.staticmethodinterface.unitconvertor;
public class UnitConvertionApp {
    public static void main(String[] args) {

        double distanceKm = 120.0;
        double weightKg = 500.0;

        double distanceMiles = UnitConverter.kmToMiles(distanceKm);
        double weightLbs = UnitConverter.kgToLbs(weightKg);

        System.out.println("Distance: " + distanceKm + " km = " + distanceMiles + " miles");

        System.out.println("Weight: " + weightKg + " kg = " + weightLbs + " lbs");
    }
}