package com.EventManager;

// Represents an event ticket
public class Ticket{
    double price;
    public Ticket(double price){
        this.price=price;
    }

    // Display ticket price
    public void display(){
        System.out.println("Ticket Price: "+price);
    }
}
