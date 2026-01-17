package com.SmartLibrary;

// Represents a borrowed book
public class BorrowedBook{
    String title;
    public BorrowedBook(String title){
        this.title=title;
    }

    // Display book title
    public void display(){
        System.out.println(title);
    }
}
