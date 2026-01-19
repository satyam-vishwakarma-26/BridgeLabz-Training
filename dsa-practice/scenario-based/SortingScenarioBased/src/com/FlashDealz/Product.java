package com.FlashDealz;

// Represents a product in flash sale
public class Product{
    String name;
    double discount;
    public Product(String name,double discount){
        this.name=name;
        this.discount=discount;
    }

    // Display product details
    public void display(){
        System.out.println(name+" | Discount: "+discount+"%");
    }
}
