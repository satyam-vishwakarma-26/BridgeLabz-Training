package com.AmbulanceRoute;
// Node representing a hospital unit
public class HospitalUnit{
    String name;
    boolean available;
    HospitalUnit next;
    // Constructor to create unit
    public HospitalUnit(String name,boolean available){
        this.name=name;
        this.available=available;
        this.next=null;
    }
}
