package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Product class
class Product{
  int productId;
  String productName;
  double price;

  //constructor 
  public Product(int productId,String productName,double price){
      this.productId=productId;
      this.productName=productName;
      this.price=price;
  }

  public void showProduct(){
      System.out.println(productName+" (₹"+price+")");
  }
}
