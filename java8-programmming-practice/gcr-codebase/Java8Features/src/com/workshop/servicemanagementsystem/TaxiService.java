package com.workshop.servicemanagementsystem;
public class TaxiService implements TransportService {

    private String route;
    private double fare;
    private int departureTime;
    private boolean peak;

    public TaxiService(String route, double fare, int departureTime, boolean peak) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
        this.peak = peak;
    }

    public String getServiceName() { return "Taxi"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public int getDepartureTime() { return departureTime; }
    public boolean isPeakTime() { return peak; }
}
