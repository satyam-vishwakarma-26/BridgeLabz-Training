package com.TrainCompanion;

// Node representing a train compartment
public class Compartment{
    String name;
    Compartment prev;
    Compartment next;
    
    // Constructor to create compartment
    public Compartment(String name){
        this.name=name;
        this.prev=null;
        this.next=null;
    }
}
