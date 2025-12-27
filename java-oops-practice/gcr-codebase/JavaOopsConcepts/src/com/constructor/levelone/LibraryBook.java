package com.constructor.levelone;

public class LibraryBook {

    // public variable
    public String ISBN;

    // protected variable
    protected String title;

    // private variable
    private String author;

    // constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter for author
    public String getAuthor() {
        return author;
    }
}

