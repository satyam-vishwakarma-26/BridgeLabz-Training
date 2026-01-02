package com.encapsulation.LibraryManagementSystem;

//abstract class
abstract class LibraryItem{
  private int itemId;
  private String title;
  private String author;
  private boolean isAvailable=true;
  private String borrowerName; //protected data

  public LibraryItem(int itemId,String title,String author){
      this.itemId=itemId;
      this.title=title;
      this.author=author;
  }

  //abstract method
  public abstract int getLoanDuration();

  //concrete method
  public void getItemDetails(){
      System.out.println("Item ID: "+itemId);
      System.out.println("Title: "+title);
      System.out.println("Author: "+author);
      System.out.println("Loan Duration: "+getLoanDuration()+" days");
  }

  //encapsulation
  protected void setBorrower(String name){
      borrowerName=name;
      isAvailable=false;
  }

  protected void clearBorrower(){
      borrowerName=null;
      isAvailable=true;
  }

  protected boolean isAvailable(){
      return isAvailable;
  }

  protected String getBorrower(){
      return borrowerName;
  }
}