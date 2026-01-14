package com.constructor.levelone;

public class ProductDriver {

    public static void main(String[] args) {

        // create products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        // display product details
        p1.displayProductDetails();
        System.out.println("-----");
        p2.displayProductDetails();
        System.out.println("-----");
        p3.displayProductDetails();

        System.out.println("-----");

        // display total products
        Product.displayTotalProducts();
    }
}

