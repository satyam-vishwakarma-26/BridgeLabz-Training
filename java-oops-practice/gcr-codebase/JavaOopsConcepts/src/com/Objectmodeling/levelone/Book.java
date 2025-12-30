package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Book class (independent entity)
class Book{
  String title;
  String author;

  //constructor
  public Book(String title,String author){
      this.title=title;
      this.author=author;
  }

  //display book details
  public void showBook(){
      System.out.println("Title: "+title+", Author: "+author);
  }
}
