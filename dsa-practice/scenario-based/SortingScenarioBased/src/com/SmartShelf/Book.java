package com.SmartShelf;

// Represents a book in the reading list
public class Book{
    String title;
    public Book(String title){
        this.title=title;
    }

    // Display book title
    public void display(){
        System.out.println(title);
    }
}
