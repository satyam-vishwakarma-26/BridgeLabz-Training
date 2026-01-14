package com.constructor.levelone;

public class Product {

    // instance variables
    public String productName;
    public double price;

    // class variable (shared)
    public static int totalProducts = 0;

    // constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // count products
    }

    // instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

