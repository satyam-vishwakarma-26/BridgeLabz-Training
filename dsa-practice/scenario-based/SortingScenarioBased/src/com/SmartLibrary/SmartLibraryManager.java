package com.SmartLibrary;
import java.util.*;

// Manages borrowed books and insertion sort
public class SmartLibraryManager{
    private ArrayList<BorrowedBook> books=new ArrayList<>();

    // Add book and keep list sorted alphabetically
    public void addBook(String title){
        BorrowedBook book=new BorrowedBook(title);
        books.add(book);
        insertionSort();
        System.out.println("Book issued and list updated");
    }
    
    // Insertion Sort by book title
    private void insertionSort(){
        for(int i=1;i<books.size();i++){
            BorrowedBook key=books.get(i);
            int j=i-1;
            while(j>=0&&books.get(j).title.compareToIgnoreCase(key.title)>0){
                books.set(j+1,books.get(j));
                j--;
            }
            books.set(j+1,key);
        }
    }
    
    // Display borrowed books
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books borrowed");
            return;
        }
        for(BorrowedBook b:books){
            b.display();
        }
    }
}
