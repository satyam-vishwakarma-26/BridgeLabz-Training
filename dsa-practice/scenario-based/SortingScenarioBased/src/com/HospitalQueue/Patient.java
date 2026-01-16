package com.HospitalQueue;

// Represents a patient in ER
public class Patient{
    String name;
    int criticality;
    public Patient(String name,int criticality){
        this.name=name;
        this.criticality=criticality;
    }

    // Display patient info
    public void display(){
        System.out.println(name+" | Criticality: "+criticality);
    }
}
