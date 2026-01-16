package com.generics.smartwarehouse;
import java.util.*;
// Utility class using wildcard
public class WarehouseUtil{
    // Display items of any warehouse type
    public static void displayAll(List<? extends WarehouseItem> list){
        for(WarehouseItem item:list){
            item.display();
        }
    }
}
