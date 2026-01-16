package com.SmartShelf;
import java.util.*;

// Manages real-time book arrangement
public class SmartShelf{
    private ArrayList<Book> books=new ArrayList<>();

    // Add book and keep list sorted using insertion sort
    public void addBook(String title){
        Book newBook=new Book(title);
        books.add(newBook);
        insertionSort();
        System.out.println("Book added and sorted");
    }
    
    // Insertion Sort by book title
    private void insertionSort(){
        for(int i=1;i<books.size();i++){
            Book key=books.get(i);
            int j=i-1;
            while(j>=0&&books.get(j).title.compareToIgnoreCase(key.title)>0){
                books.set(j+1,books.get(j));
                j--;
            }
            books.set(j+1,key);
        }
    }
    
    // Display reading list
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("Reading list is empty");
            return;
        }
        for(Book b:books){
            b.display();
        }
    }
}
