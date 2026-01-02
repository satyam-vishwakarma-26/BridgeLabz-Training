package com.encapsulation.LibraryManagementSystem;

//DVD class
class DVD extends LibraryItem implements Reservable{
  public DVD(int id,String title,String author){
      super(id,title,author);
  }

  public int getLoanDuration(){
      return 3;
  }

  public void reserveItem(String borrowerName){
      if(isAvailable()){
          setBorrower(borrowerName);
          System.out.println("DVD reserved by "+borrowerName);
      }else{
          System.out.println("DVD already reserved");
      }
  }

  public boolean checkAvailability(){
      return isAvailable();
  }
}
