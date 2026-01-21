package com.MedWarehouse;

// Represents a medicine record
public class Medicine{
    String name;
    int expiryDays;
    public Medicine(String name,int expiryDays){
        this.name=name;
        this.expiryDays=expiryDays;
    }

    // Display medicine details
    public void display(){
        System.out.println(name+" | Expiry in days: "+expiryDays);
    }
}
