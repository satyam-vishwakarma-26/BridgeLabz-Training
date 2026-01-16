package com.generics.smartwarehouse;
// Base abstract class for all warehouse items
public abstract class WarehouseItem{
    private String id;
    private String name;
    protected WarehouseItem(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    // Abstract method for item info
    public abstract void display();
}
