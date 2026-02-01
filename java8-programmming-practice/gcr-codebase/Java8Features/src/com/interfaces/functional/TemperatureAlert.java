package com.interfaces.functional;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 40.0;

        // Predicate to check if temperature crosses the threshold
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemperature = 45.5;

        if (isHighTemperature.test(currentTemperature)) {
            System.out.println("Alert! Temperature crossed the threshold: " + currentTemperature + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemperature + "°C");
        }
    }
}