package com.encapsulation.ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class EcommercePlatform{
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 90000));
        products.add(new Clothing(202, "abc", 5000));
        products.add(new Groceries(303, "xyz", 7100));

        BillingService.printFinalPrice(products);
    }
}