package com.RoboWarehouse;
// Represents a package with weight
public class PackageItem{
    double weight;
    public PackageItem(double weight){
        this.weight=weight;
    }
    // Display package weight
    public void display(){
        System.out.println("Package Weight: "+weight);
    }
}
