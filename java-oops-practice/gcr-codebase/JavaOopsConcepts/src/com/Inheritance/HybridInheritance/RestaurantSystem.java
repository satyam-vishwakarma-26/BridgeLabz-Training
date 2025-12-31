package com.Inheritance.HybridInheritance;

//Main class
public class RestaurantSystem{
public static void main(String[] args){
    Worker w1=new Chef("Rohit",1,"Italian");
    Worker w2=new Waiter("Aman",2,5);

    w1.performDuties();
    w2.performDuties();
}
}