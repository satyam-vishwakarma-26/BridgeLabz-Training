package com.encapsulation.LibraryManagementSystem;

//Book class
class Book extends LibraryItem implements Reservable{
  public Book(int id,String title,String author){
      super(id,title,author);
  }

  public int getLoanDuration(){
      return 14;
  }

  public void reserveItem(String borrowerName){
      if(isAvailable()){
          setBorrower(borrowerName);
          System.out.println("Book reserved by "+borrowerName);
      }else{
          System.out.println("Book already reserved");
      }
  }

  public boolean checkAvailability(){
      return isAvailable();
  }
}
