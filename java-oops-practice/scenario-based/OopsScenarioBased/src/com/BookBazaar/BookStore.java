package com.BookBazaar;
import java.util.ArrayList;

public class BookStore{

	//Storing the book object 
    private ArrayList<Book> books=new ArrayList<>();
    
    
    //Method to add books 
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully ✅");
    }

    //Method to show the books 
    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }

        for(int i=0;i<books.size();i++){
            System.out.println("\nBook ID: "+i);
            books.get(i).showBook();
        }
    }

    public Book getBook(int index){
        if(index>=0 && index<books.size()){
            return books.get(index);
        }
        return null;
    }
}
