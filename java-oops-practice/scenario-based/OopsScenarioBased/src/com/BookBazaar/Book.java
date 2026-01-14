package com.BookBazaar;
public abstract class Book implements IDiscountable{

	//Created private variable for storing the book details 
    protected String title;
    protected String author;
    protected double price;
    private int stock; //encapsulated

    //Constructor 
    public Book(String title,String author,double price,int stock){
        this.title=title;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }

    //getter
    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    //admin can update stock
    public void addStock(int qty){
        stock+=qty;
    }

    //user purchase
    public boolean reduceStock(int qty){
        if(qty<=stock){
            stock-=qty;
            return true;
        }
        return false;
    }

    public void showBook(){
        System.out.println("Title  : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price  : ₹"+price);
        System.out.println("Stock  : "+stock);
    }
}
