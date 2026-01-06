package com.PetPal;

public class Bird extends Pet{

	//Bird Constructor for initializing the object variable 
    public Bird(String name,int age){
        super(name,"Bird",age);
    }

    //polymorphism
    public void makeSound(){
        System.out.println(name+" says: Chirp Chirp!");
    }
}
