package com.encapsulation.OnlineFoodDeliverySystem;

//Veg item class
class VegItem extends FoodItem implements Discountable{
  private double discount;

  public VegItem(String name,double price,int qty){
      super(name,price,qty);
  }

  public double calculateTotalPrice(){
      double total=getPrice()*getQuantity();
      return total-discount;
  }

  public void applyDiscount(double percent){
      discount=(getPrice()*getQuantity()*percent)/100;
  }

  public String getDiscountDetails(){
      return "Veg Discount Applied: ₹"+discount;
  }
}
