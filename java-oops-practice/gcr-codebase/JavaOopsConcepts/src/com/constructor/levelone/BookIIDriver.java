package com.constructor.levelone;

public class BookIIDriver {

    public static void main(String[] args) {

        // create book object
        BookII b1 = new BookII("Java Basics", "James Gosling", 450);

        b1.display();
        System.out.println("-----");

        // borrow book
        b1.borrowBook();
        b1.display();

        System.out.println("-----");

        // try borrowing again
        b1.borrowBook();
    }
}

