package com.BirdSanctuary;
// Base class for all birds
@DeveloperInfo(developer="EcoWing Team",version="1.0")
public abstract class Bird{
    private String id;
    private String name;
    private String species;
    protected Bird(String id,String name,String species){
        this.id=id;
        this.name=name;
        this.species=species;
    }
    // Common behavior
    public void eat(){
        System.out.println(name+" is eating");
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    // Display bird info
    public void display(){
        System.out.print("ID:"+id+" Name:"+name+" Species:"+species+" ");
        if(this instanceof Flyable){
            System.out.print("[Flyable] ");
        }
        if(this instanceof Swimmable){
            System.out.print("[Swimmable] ");
        }
        if(!(this instanceof Flyable)&&!(this instanceof Swimmable)){
            System.out.print("[Neither] ");
        }
        System.out.println();
    }
}
