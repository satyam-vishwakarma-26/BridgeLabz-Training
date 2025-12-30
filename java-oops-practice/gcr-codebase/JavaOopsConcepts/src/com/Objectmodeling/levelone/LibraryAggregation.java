package com.Objectmodeling.levelone;

public class LibraryAggregation{
    public static void main(String[] args){

        //creating independent book objects
        Book b1=new Book("Effective Java","Joshua Bloch");
        Book b2=new Book("Clean Code","Robert C. Martin");
        Book b3=new Book("Java: The Complete Reference","Herbert Schildt");

        //creating libraries
        Library lib1=new Library("Central Library");
        Library lib2=new Library("College Library");

        //adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); //same book in another library
        lib2.addBook(b3);

        //display libraries
        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
