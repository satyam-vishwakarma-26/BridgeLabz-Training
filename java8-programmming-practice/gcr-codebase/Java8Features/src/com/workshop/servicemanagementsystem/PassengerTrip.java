package com.workshop.servicemanagementsystem;
public class PassengerTrip {
    String route;
    double fare;
    boolean peak;

    public PassengerTrip(String route, double fare, boolean peak) {
        this.route = route;
        this.fare = fare;
        this.peak = peak;
    }
}
