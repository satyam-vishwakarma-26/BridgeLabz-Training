package com.SmartCheckout;
import java.util.List;

// Represents a customer with shopping items
public class Customer{
    String name;
    List<String> items;

    //Creating constructor 
    public Customer(String name,List<String> items){
        this.name=name;
        this.items=items;
    }
}
