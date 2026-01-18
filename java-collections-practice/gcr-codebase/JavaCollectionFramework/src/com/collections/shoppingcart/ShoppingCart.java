package com.collections.shoppingcart;
import java.util.*;

public class ShoppingCart {

    // stores product prices
    static Map<String, Integer> priceMap = new HashMap<>();

    // maintains order of items added
    static Map<String, Integer> cart = new LinkedHashMap<>();

    static void addProduct(String name, int price) {
        priceMap.put(name, price);
        cart.put(name, price);
    }

    static void displayCartOrder() {
        System.out.println("Cart Items (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void displaySortedByPrice() {
        // TreeMap sorts items by price
        Map<Integer, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sorted.putIfAbsent(entry.getValue(), new ArrayList<>());
            sorted.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("Cart Items (Sorted by Price):");
        for (Map.Entry<Integer, List<String>> entry : sorted.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object For Taking User Inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            addProduct(name, price);
        }

        displayCartOrder();
        displaySortedByPrice();

        sc.close();
    }
}