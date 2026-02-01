package com.lanbdaexpressions.customsorting_in_ecommers;
import java.util.*;

public class ECommerceSort {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Laptop", 70000, 4.5, 10),
            new Product("Mobile", 30000, 4.7, 15),
            new Product("Headphones", 3000, 4.2, 25),
            new Product("Smart Watch", 12000, 4.4, 20)
        );

        // Sort by Price
        products.sort((p1, p2) -> 
            Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // Sort by Rating
        products.sort((p1, p2) -> 
            Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // Sort by Discount
        products.sort((p1, p2) -> 
            Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}