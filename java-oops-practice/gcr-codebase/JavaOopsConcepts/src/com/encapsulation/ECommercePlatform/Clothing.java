package com.encapsulation.ECommercePlatform;



public class Clothing extends Product implements Taxable {

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    //For calculating the discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    //For calculating of the tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    //For the details of the tax
    @Override
    public void getTaxDetails() {
        System.out.println("Tax: 5% (Clothing)");
    }
}
