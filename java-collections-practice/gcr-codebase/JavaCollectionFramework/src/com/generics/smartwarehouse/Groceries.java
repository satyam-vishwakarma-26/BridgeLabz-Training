package com.generics.smartwarehouse;
// Groceries item type
public class Groceries extends WarehouseItem{
    public Groceries(String id,String name){
        super(id,name);
    }
    public void display(){
        System.out.println("Groceries | ID:"+getId()+" Name:"+getName());
    }
}
