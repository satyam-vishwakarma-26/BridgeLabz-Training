package com.encapsulation.LibraryManagementSystem;

//Magazine class
class Magazine extends LibraryItem implements Reservable{
  public Magazine(int id,String title,String author){
      super(id,title,author);
  }

  public int getLoanDuration(){
      return 7;
  }

  public void reserveItem(String borrowerName){
      if(isAvailable()){
          setBorrower(borrowerName);
          System.out.println("Magazine reserved by "+borrowerName);
      }else{
          System.out.println("Magazine already reserved");
      }
  }

  public boolean checkAvailability(){
      return isAvailable();
  }
}
