package com.IceCreamRush;

// Represents an ice cream flavor with sales count
public class IceCreamFlavor{
    String flavorName;
    int soldCount;
    public IceCreamFlavor(String flavorName,int soldCount){
        this.flavorName=flavorName;
        this.soldCount=soldCount;
    }

    // Display flavor details
    public void display(){
        System.out.println(flavorName+" | Sold: "+soldCount);
    }
}
