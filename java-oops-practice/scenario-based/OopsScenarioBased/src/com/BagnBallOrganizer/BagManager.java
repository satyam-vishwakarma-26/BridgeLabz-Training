package com.BagnBallOrganizer;
import java.util.*;
// Manages multiple bags
public class BagManager{
    private List<Bag> bags=new ArrayList<>();
    // Add new bag
    public void addBag(Bag bag){
        bags.add(bag);
        System.out.println("Bag added");
    }
    // Find bag by ID
    public Bag getBag(String bagId){
        for(Bag b:bags){
            if(b.getId().equals(bagId)){
                return b;
            }
        }
        return null;
    }
    // Display all bags
    public void displayAllBags(){
        if(bags.isEmpty()){
            System.out.println("No bags available");
            return;
        }
        for(Bag b:bags){
            b.displayBag();
        }
    }
}
