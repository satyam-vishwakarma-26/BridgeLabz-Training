package com.workshop.servicemanagementsystem;
public class AmbulanceService implements TransportService, EmergencyService {

    public String getServiceName() { return "Ambulance"; }
    public String getRoute() { return "Any"; }
    public double getFare() { return 0; }
    public int getDepartureTime() { return 0; }
    public boolean isPeakTime() { return true; }
}
