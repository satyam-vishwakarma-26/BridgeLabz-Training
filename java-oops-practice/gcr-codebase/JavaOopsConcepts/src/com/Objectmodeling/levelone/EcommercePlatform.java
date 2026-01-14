package com.Objectmodeling.levelone;

public class EcommercePlatform{
    public static void main(String[] args){

        //create products
        Product p1=new Product(1,"Laptop",55000);
        Product p2=new Product(2,"Mouse",500);
        Product p3=new Product(3,"Keyboard",1200);

        //create customer
        CustomerII customer=new CustomerII(101,"Rohan");

        //create order
        Order order1=new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        //customer places order
        customer.placeOrder(order1);
    }
}
