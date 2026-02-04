package com.collectors.orderrevenue;
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = List.of(
            new Order("Alice", 250.50),
            new Order("Bob", 120.00),
            new Order("Alice", 300.75),
            new Order("Charlie", 450.00),
            new Order("Bob", 80.25)
        );

        // Sum order totals per customer
        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomerName,
                              Collectors.summingDouble(Order::getOrderTotal)
                      ));

        // Print result
        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " -> Total Revenue: " + total)
        );
    }
}
