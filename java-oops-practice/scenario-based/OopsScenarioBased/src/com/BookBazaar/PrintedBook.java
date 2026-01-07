package com.BookBazaar;
public class PrintedBook extends Book{

    private double discount;

    //constructor for initializing the object variable 
    public PrintedBook(String title,String author,double price,int stock,double discount){
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
