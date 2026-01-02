package com.encapsulation.ECommercePlatform;


import java.util.List;

public class BillingService {

    static void printFinalPrice(List<Product> products) {

        for (Product p : products) {
            p.getProductDetails();

            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                t.getTaxDetails();
                tax = t.calculateTax();
            } else {
                System.out.println("Tax: Not Applicable");
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount is about ₹" + discount);
            System.out.println("Final Price is about  ₹" + finalPrice);
        }
    }
}
