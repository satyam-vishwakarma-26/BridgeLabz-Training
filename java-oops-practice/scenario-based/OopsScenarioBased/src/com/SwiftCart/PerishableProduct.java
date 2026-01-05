package com.SwiftCart;
/* ---------- Perishable Product ---------- */
class PerishableProduct extends Product{

    public PerishableProduct(String name,double price,int quantity){
        super(name,price,quantity,"Perishable");
    }

    //higher discount for perishable items
    public double getDiscount(){
        return getTotalPrice()*0.10; //10% discount
    }
}