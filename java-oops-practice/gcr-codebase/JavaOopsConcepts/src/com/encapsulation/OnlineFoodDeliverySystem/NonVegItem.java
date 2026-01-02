package com.encapsulation.OnlineFoodDeliverySystem;

//Non-veg item class
class NonVegItem extends FoodItem implements Discountable{
  private double extraCharge=50;
  private double discount;

  public NonVegItem(String name,double price,int qty){
      super(name,price,qty);
  }

  public double calculateTotalPrice(){
      double total=(getPrice()*getQuantity())+extraCharge;
      return total-discount;
  }

  public void applyDiscount(double percent){
      discount=((getPrice()*getQuantity())*percent)/100;
  }

  public String getDiscountDetails(){
      return "Non-Veg Discount Applied: ₹"+discount;
  }
}
