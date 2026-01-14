package com.FoodLoop;
public abstract class FoodItem{

    protected String name;
    protected String category;
    protected double price;
    private int stock; //encapsulated

    //FoodItem Constructor 
    public FoodItem(String name,String category,double price,int stock){
        this.name=name;
        this.category=category;
        this.price=price;
        this.stock=stock;
    }

    //getters 
    
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public boolean isAvailable(){
        return stock>0;
    }

    //reduce stock internally
    public boolean consume(){
        if(stock>0){
            stock--;
            return true;
        }
        return false;
    }

    public void showItem(){
        System.out.println(name+" ("+category+") - ₹"+price+" | Available: "+(stock>0));
    }
}
