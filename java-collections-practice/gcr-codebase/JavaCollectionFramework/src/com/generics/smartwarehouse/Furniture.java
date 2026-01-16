package com.generics.smartwarehouse;
// Furniture item type
public class Furniture extends WarehouseItem{
    public Furniture(String id,String name){
        super(id,name);
    }
    public void display(){
        System.out.println("Furniture | ID:"+getId()+" Name:"+getName());
    }
}
