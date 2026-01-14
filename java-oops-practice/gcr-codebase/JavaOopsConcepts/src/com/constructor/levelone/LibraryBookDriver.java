package com.constructor.levelone;

public class LibraryBookDriver extends ELibraryBook {

    // constructor
    public LibraryBookDriver(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author, fileSize);
    }

    public static void main(String[] args) {

        LibraryBookDriver driver =
                new LibraryBookDriver("978-0134685991",
                                      "Effective Java",
                                      "Joshua Bloch",
                                      5.1);

        driver.displayELibraryBook();

        System.out.println("-----");

        // modify author using setter
        driver.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + driver.getAuthor());
    }
}

