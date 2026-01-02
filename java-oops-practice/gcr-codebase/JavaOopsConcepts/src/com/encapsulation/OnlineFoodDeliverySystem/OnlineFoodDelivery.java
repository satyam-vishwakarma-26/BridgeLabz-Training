package com.encapsulation.OnlineFoodDeliverySystem;

import java.util.ArrayList;


//Main class
public class OnlineFoodDelivery{
  public static void main(String[] args){

      ArrayList<FoodItem> order=new ArrayList<>();

      FoodItem f1=new VegItem("Paneer Butter Masala",250,2);
      FoodItem f2=new NonVegItem("Chicken Biryani",300,1);

      ((Discountable)f1).applyDiscount(10);
      ((Discountable)f2).applyDiscount(5);

      order.add(f1);
      order.add(f2);

      double grandTotal=0;

      System.out.println("---- Order Details ----");
      for(FoodItem item:order){
          item.getItemDetails();
          System.out.println("Total Price: ₹"+item.calculateTotalPrice());
          System.out.println(((Discountable)item).getDiscountDetails());
          System.out.println();
          grandTotal+=item.calculateTotalPrice();
      }

      System.out.println("Grand Total Amount: ₹"+grandTotal);
  }
}
