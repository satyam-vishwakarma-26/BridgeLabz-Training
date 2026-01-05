package com.SwiftCart;
/* ---------- Main Class ---------- */
public class SwiftCartApp{
    public static void main(String[] args){

        //products
        Product p1=new PerishableProduct("Milk",50,2);
        Product p2=new PerishableProduct("Vegetables",30,3);
        Product p3=new NonPerishableProduct("Rice",60,5);
        Product p4=new NonPerishableProduct("Oil",150,1);

        //cart
        Cart cart=new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        //checkout
        cart.generateBill();
    }
}