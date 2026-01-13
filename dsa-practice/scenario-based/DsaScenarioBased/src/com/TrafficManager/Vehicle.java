package com.TrafficManager;

// Node representing a vehicle in the roundabout
public class Vehicle{
    String number;
    Vehicle next;

    // Constructor to create vehicle
    public Vehicle(String number){
        this.number=number;
        this.next=null;
    }
}
