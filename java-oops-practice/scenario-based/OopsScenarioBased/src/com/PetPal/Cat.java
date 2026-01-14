package com.PetPal;

public class Cat extends Pet{

	//Cat Constructor for initializing the object variable 
    public Cat(String name,int age){
        super(name,"Cat",age);
    }

    //polymorphism
    public void makeSound(){
        System.out.println(name+" says: Meow!");
    }
}
