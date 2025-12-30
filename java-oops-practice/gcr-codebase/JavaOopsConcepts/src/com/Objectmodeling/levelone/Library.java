package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Library class (aggregates Book objects)
class Library{
String libraryName;
ArrayList<Book> books=new ArrayList<>();

//constructor
public Library(String libraryName){
    this.libraryName=libraryName;
}

//add book to library
public void addBook(Book book){
    books.add(book);
}

//display library books
public void showLibraryBooks(){
    System.out.println("\nLibrary: "+libraryName);
    for(Book b:books){
        b.showBook();
    }
}
}
