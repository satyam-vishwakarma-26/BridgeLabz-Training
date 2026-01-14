package com.encapsulation.ECommercePlatform;

public class Electronics extends Product implements Taxable {

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    //For Calculating the discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    //For the GST part
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 18% GST (Electronics)");
    }
}
