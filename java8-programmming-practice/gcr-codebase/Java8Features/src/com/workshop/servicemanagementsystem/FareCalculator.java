package com.workshop.servicemanagementsystem;
@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, boolean isPeak);
}
