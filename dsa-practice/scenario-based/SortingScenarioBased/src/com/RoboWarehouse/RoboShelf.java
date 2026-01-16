package com.RoboWarehouse;
import java.util.*;
// Manages shelf loading and sorting
public class RoboShelf{
    private ArrayList<PackageItem> packages=new ArrayList<>();
    // Add package and keep shelf sorted
    public void addPackage(double weight){
        PackageItem newItem=new PackageItem(weight);
        packages.add(newItem);
        insertionSort();
        System.out.println("Package loaded and shelf balanced");
    }
    // Insertion Sort by weight (ascending)
    private void insertionSort(){
        for(int i=1;i<packages.size();i++){
            PackageItem key=packages.get(i);
            int j=i-1;
            while(j>=0&&packages.get(j).weight>key.weight){
                packages.set(j+1,packages.get(j));
                j--;
            }
            packages.set(j+1,key);
        }
    }
    // Display shelf state
    public void displayShelf(){
        if(packages.isEmpty()){
            System.out.println("Shelf is empty");
            return;
        }
        for(PackageItem p:packages){
            p.display();
        }
    }
}
