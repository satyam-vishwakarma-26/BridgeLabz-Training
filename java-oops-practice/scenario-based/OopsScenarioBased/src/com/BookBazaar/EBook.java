package com.BookBazaar;
public class EBook extends Book{

    private double discount; //admin controlled

    //Constructor for initializing the object variable 
    public EBook(String title,String author,double price,int stock,double discount){
        super(title,author,price,stock);
        this.discount=discount;
    }

    @Override
    public double applyDiscount(int quantity){
        double total=price*quantity;
        double discountAmount=total*(discount/100);
        return total-discountAmount;
    }
}
