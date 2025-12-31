package com.Inheritance.SingleInheritance;

//Main class
public class LibraryManagement{
public static void main(String[] args){
    Author book1=new Author(
        "Effective Java",
        2018,
        "Joshua Bloch",
        "Java expert and author"
    );
    book1.displayInfo();
}
}
