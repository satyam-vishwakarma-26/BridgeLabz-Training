package com.BirdSanctuary;
// Penguin can swim
public class Penguin extends Bird implements Swimmable{
    public Penguin(String id,String name){
        super(id,name,"Penguin");
    }
    public void swim(){
        System.out.println(getName()+" swims swiftly in water");
    }
}
