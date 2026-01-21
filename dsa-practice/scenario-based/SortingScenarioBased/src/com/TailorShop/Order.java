package com.TailorShop;

// Represents a tailoring order
public class Order{
    String customerName;
    int deadline;
    public Order(String customerName,int deadline){
        this.customerName=customerName;
        this.deadline=deadline;
    }

    // Display order details
    public void display(){
        System.out.println(customerName+" | Deadline: "+deadline);
    }
}
