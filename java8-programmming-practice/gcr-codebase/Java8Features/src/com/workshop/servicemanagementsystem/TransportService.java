package com.workshop.servicemanagementsystem;
public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime(); // minutes from midnight
    boolean isPeakTime();

    default void printServiceDetails() {
        System.out.println(
            getServiceName() + " | Route: " + getRoute() +
            " | Fare: " + getFare() +
            " | Departure: " + getDepartureTime()
        );
    }
}
