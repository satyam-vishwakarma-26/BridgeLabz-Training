package com.encapsulation.LibraryManagementSystem;

import java.util.ArrayList;

//main class
public class LibraryManagementSystem{
  public static void main(String[] args){

      ArrayList<LibraryItem> items=new ArrayList<>();

      LibraryItem b1=new Book(1,"Effective Java","Joshua Bloch");
      LibraryItem m1=new Magazine(2,"Java Monthly","Oracle");
      LibraryItem d1=new DVD(3,"Java Tutorial","Tech Media");

      items.add(b1);
      items.add(m1);
      items.add(d1);

      //polymorphism
      for(LibraryItem item:items){
          item.getItemDetails();
          System.out.println("----------------");
      }

      //reservation
      ((Reservable)b1).reserveItem("Rohan");
      ((Reservable)m1).reserveItem("Amit");

      System.out.println("\nAvailability Check:");
      System.out.println("Book Available: "+((Reservable)b1).checkAvailability());
      System.out.println("Magazine Available: "+((Reservable)m1).checkAvailability());
      System.out.println("DVD Available: "+((Reservable)d1).checkAvailability());
  }
}
