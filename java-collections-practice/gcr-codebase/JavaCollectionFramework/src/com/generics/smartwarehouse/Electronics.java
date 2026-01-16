package com.generics.smartwarehouse;
// Electronics item type
public class Electronics extends WarehouseItem{
    public Electronics(String id,String name){
        super(id,name);
    }
    public void display(){
        System.out.println("Electronics | ID:"+getId()+" Name:"+getName());
    }
}
