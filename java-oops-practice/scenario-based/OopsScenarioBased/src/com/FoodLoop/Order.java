package com.FoodLoop;
import java.util.ArrayList;

public class Order implements IOrderable{

    private ArrayList<FoodItem> items=new ArrayList<>();
    private double total;
    private boolean placed;

    //constructor
    public Order(){
        this.total=0;
        this.placed=false;
    }

    //AddItem method 
    public void addItem(FoodItem item){
        if(item.isAvailable() && item.consume()){
            items.add(item);
            total+=item.getPrice();
            System.out.println(item.getName()+" added to order");
        }else{
            System.out.println(item.getName()+" is out of stock ❌");
        }
    }

    //polymorphism via order value
    private double applyDiscount(){
        if(total>=1000){
            return total*0.20;
        }else if(total>=500){
            return total*0.10;
        }
        return 0;
    }

    @Override
    public void placeOrder(){
        if(items.isEmpty()){
            System.out.println("No items in order");
            return;
        }
        double discount=applyDiscount();
        double finalAmount=total-discount;

        placed=true;
        System.out.println("\nOrder Placed Successfully ✅");
        System.out.println("Total Amount   : ₹"+total);
        System.out.println("Discount       : ₹"+discount);
        System.out.println("Payable Amount : ₹"+finalAmount);
    }

    @Override
    public void cancelOrder(){
        if(!placed){
            System.out.println("Order cancelled ❌");
        }else{
            System.out.println("Order already placed, cannot cancel");
        }
    }
}
