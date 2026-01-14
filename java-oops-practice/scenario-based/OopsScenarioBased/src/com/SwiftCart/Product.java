package com.SwiftCart;
/* ---------- Base Product Class ---------- */
abstract class Product{
    protected String name;
    protected double price;
    protected int quantity;
    protected String category;

    public Product(String name,double price,int quantity,String category){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }

    //total price of this product
    public double getTotalPrice(){
        return price*quantity;
    }

    //polymorphic discount method
    public abstract double getDiscount();
}