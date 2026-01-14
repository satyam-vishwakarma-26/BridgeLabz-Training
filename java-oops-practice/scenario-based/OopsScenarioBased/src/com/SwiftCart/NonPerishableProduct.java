package com.SwiftCart;
/* ---------- Non-Perishable Product ---------- */
class NonPerishableProduct extends Product{

    public NonPerishableProduct(String name,double price,int quantity){
        super(name,price,quantity,"Non-Perishable");
    }

    //lower discount
    public double getDiscount(){
        return getTotalPrice()*0.05; //5% discount
    }
}