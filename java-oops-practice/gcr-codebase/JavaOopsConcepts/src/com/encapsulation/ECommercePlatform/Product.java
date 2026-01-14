package com.encapsulation.ECommercePlatform;

public abstract class Product {

	//Declaration
    private int productId;
    private String name;
    private double price;

    //Constructor
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: getters & controlled setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Concrete method
    void getProductDetails() {
        System.out.println("Product ID is  " + productId);
        System.out.println("Name is  " + name);
        System.out.println("Price is  ₹" + price);
    }

    // Abstract method
    abstract double calculateDiscount();
}