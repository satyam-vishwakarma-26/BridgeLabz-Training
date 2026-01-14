package com.PetPal;

import java.util.Random;

public abstract class Pet implements IInteractable{
    protected String name;
    protected String type;
    protected int age;

    private int hunger; //0 = full, 100 = very hungry
    private int mood;   //0 = sad, 100 = happy
    private int energy; //0 = tired, 100 = energetic

    //random default values constructor
    public Pet(String name,String type,int age){
        this.name=name;
        this.type=type;
        this.age=age;

        Random r=new Random();
        hunger=r.nextInt(50)+30;
        mood=r.nextInt(50)+30;
        energy=r.nextInt(50)+30;
    }

    //feed pet
    public void feed(){
        hunger-=20;
        energy+=10;
        if(hunger<0) hunger=0;
        if(energy>100) energy=100;
        System.out.println(name+" is eating...");
    }

    //play with pet
    public void play(){
        mood+=20;
        hunger+=10;
        energy-=15;
        if(mood>100) mood=100;
        if(energy<0) energy=0;
        System.out.println(name+" is playing...");
    }

    //pet sleeps
    public void sleep(){
        energy+=30;
        mood+=10;
        if(energy>100) energy=100;
        if(mood>100) mood=100;
        System.out.println(name+" is sleeping...");
    }

    //show pet status (controlled access)
    public void showStatus(){
        System.out.println("Hunger Level: "+hunger);
        System.out.println("Mood Level: "+mood);
        System.out.println("Energy Level: "+energy);
    }

    //polymorphic method
    public abstract void makeSound();

    public void showPetDetails(){
        System.out.println("\nPet Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Age: "+age);
    }
}
