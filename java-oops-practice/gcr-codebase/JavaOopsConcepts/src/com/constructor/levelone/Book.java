package com.constructor.levelone;

public class Book {

    public String title;
    public String author;
    public double price;

    //made non-parametrized constructor 
    public Book() {
        title = "Not Assigned";
        author = "Unknown";
        price = 0.0;
    }
    //made the parametrized constructor 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //method to display the result 
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
