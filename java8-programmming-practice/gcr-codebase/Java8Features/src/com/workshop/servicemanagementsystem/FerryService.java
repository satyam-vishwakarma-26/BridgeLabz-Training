package com.workshop.servicemanagementsystem;
public class FerryService implements TransportService {
    public String getServiceName() { return "Ferry"; }
    public String getRoute() { return "Harbor-A"; }
    public double getFare() { return 25; }
    public int getDepartureTime() { return 600; }
    public boolean isPeakTime() { return false; }
}
