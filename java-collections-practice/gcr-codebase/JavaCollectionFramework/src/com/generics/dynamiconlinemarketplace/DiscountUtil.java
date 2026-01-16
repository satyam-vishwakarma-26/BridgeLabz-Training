package com.generics.dynamiconlinemarketplace;
// Utility class with generic method
public class DiscountUtil{
    // Generic method with bounded type parameter
    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        double newPrice=product.getPrice()-(product.getPrice()*percentage/100);
        product.setPrice(newPrice);
        System.out.println("Discount applied");
    }
}
