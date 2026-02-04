package com.workshop.servicemanagementsystem;
public class BusService implements TransportService {

    private String route;
    private double fare;
    private int departureTime;
    private boolean peak;

    public BusService(String route, double fare, int departureTime, boolean peak) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
        this.peak = peak;
    }

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public int getDepartureTime() { return departureTime; }
    public boolean isPeakTime() { return peak; }
}
