package com.BookBazaar;
public class Order{

    private String userName;
    private String status; //restricted

    //order constructor 
    public Order(String userName){
        this.userName=userName;
        this.status="CREATED";
    }

    //method for update status 
    private void updateStatus(String newStatus){
        status=newStatus;
    }

    //method for final confirmation
    public void placeOrder(Book book,int qty){
        if(book.reduceStock(qty)){
            double amount=book.applyDiscount(qty);
            updateStatus("CONFIRMED");
            System.out.println("Order Confirmed ✅");
            System.out.println("Payable Amount: ₹"+amount);
        }else{
            updateStatus("FAILED");
            System.out.println("Insufficient Stock ❌");
        }
    }

    //method to show the order 
    public void showOrder(){
        System.out.println("User   : "+userName);
        System.out.println("Status : "+status);
    }
}
