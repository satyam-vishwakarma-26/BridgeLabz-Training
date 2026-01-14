package com.FoodLoop;
import java.util.ArrayList;

public class FoodMenu{

    private ArrayList<FoodItem> menu=new ArrayList<>();

    //constructor
    public FoodMenu(){
        //default items
        menu.add(new VegItem("Paneer Burger",150,5));
        menu.add(new VegItem("Veg Pizza",300,3));
        menu.add(new NonVegItem("Chicken Burger",200,4));
        menu.add(new NonVegItem("Chicken Biryani",350,2));
    }

    public void showMenu(){
        System.out.println("\n--- Food Menu ---");
        for(int i=0;i<menu.size();i++){
            System.out.print((i+1)+". ");
            menu.get(i).showItem();
        }
    }

    //Getter
    public FoodItem getItem(int index){
        if(index>=0 && index<menu.size()){
            return menu.get(index);
        }
        return null;
    }
}
