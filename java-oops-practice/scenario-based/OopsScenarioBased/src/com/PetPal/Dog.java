package com.PetPal;

public class Dog extends Pet{

	//Dog Constructor for initalizing the object 
    public Dog(String name,int age){
        super(name,"Dog",age);
    }

    //polymorphism
    public void makeSound(){
        System.out.println(name+" says: Woof Woof!");
    }
}
