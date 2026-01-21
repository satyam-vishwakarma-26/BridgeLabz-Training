package com.FoodFest;

// Represents a food stall
public class Stall{
    String stallName;
    int footfall;
    public Stall(String stallName,int footfall){
        this.stallName=stallName;
        this.footfall=footfall;
    }

    // Display stall details
    public void display(){
        System.out.println(stallName+" | Footfall: "+footfall);
    }
}
