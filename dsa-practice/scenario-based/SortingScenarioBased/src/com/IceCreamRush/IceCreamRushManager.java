package com.IceCreamRush;
import java.util.*;

// Manages flavors and bubble sort logic
public class IceCreamRushManager{
    private ArrayList<IceCreamFlavor> flavors=new ArrayList<>();

    // Add new flavor sales data
    public void addFlavor(String name,int count){
        flavors.add(new IceCreamFlavor(name,count));
        System.out.println("Flavor added");
    }
    
    // Bubble Sort by popularity (descending)
    public void sortByPopularity(){
        int n=flavors.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(flavors.get(j).soldCount<flavors.get(j+1).soldCount){
                    IceCreamFlavor temp=flavors.get(j);
                    flavors.set(j,flavors.get(j+1));
                    flavors.set(j+1,temp);
                }
            }
        }
        System.out.println("Flavors sorted by popularity");
    }
    
    // Display all flavors
    public void displayFlavors(){
        if(flavors.isEmpty()){
            System.out.println("No flavor data available");
            return;
        }
        for(IceCreamFlavor f:flavors){
            f.display();
        }
    }
}
