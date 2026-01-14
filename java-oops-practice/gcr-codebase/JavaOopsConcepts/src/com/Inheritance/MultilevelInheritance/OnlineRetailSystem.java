package com.Inheritance.MultilevelInheritance;

//Main class
public class OnlineRetailSystem{
public static void main(String[] args){
    Order o1=new Order(101,"01-01-2025");
    Order o2=new ShippedOrder(102,"02-01-2025","TRK123");
    Order o3=new DeliveredOrder(103,"03-01-2025","TRK456","05-01-2025");

    System.out.println(o1.getOrderStatus());
    System.out.println(o2.getOrderStatus());
    System.out.println(o3.getOrderStatus());
}
}