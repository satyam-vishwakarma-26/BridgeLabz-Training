package com.encapsulation.ECommercePlatform;

public class Groceries extends Product {

    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}