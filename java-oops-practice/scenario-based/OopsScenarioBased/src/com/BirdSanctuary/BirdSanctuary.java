package com.BirdSanctuary;
import java.util.*;
// Manages all birds in sanctuary
public class BirdSanctuary{
    private ArrayList<Bird> birds=new ArrayList<>();
    // Add bird
    public void addBird(Bird b){
        birds.add(b);
        System.out.println("Bird added");
    }
    // Display all birds
    public void displayAll(){
        for(Bird b:birds){
            b.display();
        }
    }
    // Display flying birds
    public void displayFlying(){
        for(Bird b:birds){
            if(b instanceof Flyable){
                b.display();
                ((Flyable)b).fly();
            }
        }
    }
    // Display swimming birds
    public void displaySwimming(){
        for(Bird b:birds){
            if(b instanceof Swimmable){
                b.display();
                ((Swimmable)b).swim();
            }
        }
    }
    // Display birds that can both fly and swim
    public void displayBoth(){
        for(Bird b:birds){
            if(b instanceof Flyable && b instanceof Swimmable){
                b.display();
            }
        }
    }
    // Remove bird by ID
    public void removeById(String id){
        Iterator<Bird> it=birds.iterator();
        while(it.hasNext()){
            if(it.next().getId().equals(id)){
                it.remove();
                System.out.println("Bird removed");
                return;
            }
        }
        System.out.println("Bird not found");
    }
    // Sanctuary report
    public void report(){
        int fly=0,swim=0,both=0,neither=0;
        for(Bird b:birds){
            boolean f=b instanceof Flyable;
            boolean s=b instanceof Swimmable;
            if(f&&s)both++;
            else if(f)fly++;
            else if(s)swim++;
            else neither++;
        }
        System.out.println("Flyable:"+fly);
        System.out.println("Swimmable:"+swim);
        System.out.println("Both:"+both);
        System.out.println("Neither:"+neither);
    }
}
