package com.constructor.levelone;

public class ELibraryBook extends LibraryBook {

    public double fileSize;

    // constructor
    public ELibraryBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // access public & protected members
    public void displayELibraryBook() {
        System.out.println("ISBN: " + ISBN);           // public
        System.out.println("Title: " + title);         // protected
        System.out.println("Author: " + getAuthor());  // private via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

