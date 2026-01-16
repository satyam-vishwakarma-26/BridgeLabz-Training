package com.generics.smartwarehouse;
import java.util.*;
// Generic storage class with bounded type parameter
public class Storage<T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();
    // Add item safely
    public void addItem(T item){
        items.add(item);
        System.out.println("Item stored");
    }
    // Retrieve all items
    public List<T> getItems(){
        return items;
    }
}
