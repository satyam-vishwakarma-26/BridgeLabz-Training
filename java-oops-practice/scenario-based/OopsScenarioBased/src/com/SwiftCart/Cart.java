package com.SwiftCart;

import java.util.ArrayList;

/* ---------- Cart Class ---------- */
class Cart implements ICheckout{
    private ArrayList<Product> products=new ArrayList<>();
    private double totalPrice; //encapsulated

    //default constructor
    public Cart(){}

    //constructor with pre-selected items
    public Cart(ArrayList<Product> items){
        products.addAll(items);
    }

    //only cart can update price
    private void calculateTotal(){
        totalPrice=0;
        for(Product p:products){
            totalPrice+=p.getTotalPrice();
        }
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    //apply discount using polymorphism
    public void applyDiscount(){
        double discount=0;
        for(Product p:products){
            discount+=p.getDiscount();
        }
        totalPrice=totalPrice-discount;
        System.out.println("Total Discount Applied: ₹"+discount);
    }

    //generate final bill
    public void generateBill(){
        calculateTotal();
        System.out.println("\n----- SwiftCart Bill -----");
        for(Product p:products){
            System.out.println(
                p.name+" | "+p.category+
                " | Qty: "+p.quantity+
                " | Price: ₹"+p.getTotalPrice()
            );
        }
        System.out.println("Subtotal: ₹"+totalPrice);
        applyDiscount();
        System.out.println("Final Amount: ₹"+totalPrice);
    }
}