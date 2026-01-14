package com.MediStore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable{
    private String name;
    private double price;            
    private int quantity;           
    private LocalDate expiryDate;

    //default quantity constructor
    public Medicine(String name,double price,LocalDate expiryDate){
        this(name,price,expiryDate,10);
    }

    //admin provided quantity
    public Medicine(String name,double price,LocalDate expiryDate,int quantity){
        this.name=name;
        this.price=price;
        this.expiryDate=expiryDate;
        this.quantity=quantity;
    }

    //user sell flow
    @Override
    public void sell(int qty){
        if(checkExpiry()){
            System.out.println(name+" is expired.");
            return;
        }
        if(qty<=0||qty>quantity){
            System.out.println("Invalid quantity. Available: "+quantity);
            return;
        }
        double bill=calculateBill(qty);
        quantity-=qty;
        System.out.println("✔ Sold "+qty+" of "+name);
        System.out.println("💰 Bill: ₹"+bill);
        System.out.println("📦 Stock Left: "+quantity);
    }

    //private pricing logic
    private double calculateBill(int qty){
        double total=price*qty;
        if(qty>=5) total-=total*0.10; 
        return total;
    }

    //admin stock update
    public void addStock(int qty){
        if(qty>0){
            quantity+=qty;
            System.out.println("Stock updated. New stock: "+quantity);
        }
    }

    //admin price update
    public void updatePrice(double newPrice){
        if(newPrice>0){
            price=newPrice;
            System.out.println("Price updated.");
        }
    }

    //protected for child classes
    protected LocalDate getExpiryDate(){
        return expiryDate;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println(name+" | Price: ₹"+price+" | Stock: "+quantity+" | Exp: "+expiryDate);
    }
}
