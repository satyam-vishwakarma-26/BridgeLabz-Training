package com.encapsulation.LibraryManagementSystem;

//interface
interface Reservable{
  void reserveItem(String borrowerName);
  boolean checkAvailability();
}
