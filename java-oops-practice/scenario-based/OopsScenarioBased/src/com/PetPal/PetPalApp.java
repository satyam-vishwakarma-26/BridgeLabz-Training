package com.PetPal;

import java.util.Scanner;

public class PetPalApp{
    public static void main(String[] args){

    	//Creating Scanner object for taking user inputs 
        Scanner sc=new Scanner(System.in);

        // Pet Adoption
        System.out.println("Welcome to PetPal 🐾");
        System.out.println("Choose a pet to adopt:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter pet name: ");
        String name=sc.nextLine();

        System.out.print("Enter pet age: ");
        int age=sc.nextInt();

        Pet pet;
        if(choice==1){
            pet=new Dog(name,age);
        }else if(choice==2){
            pet=new Cat(name,age);
        }else{
            pet=new Bird(name,age);
        }

        // Showing Details 
        pet.showPetDetails();
        pet.makeSound();
        pet.showStatus();

        //Interaction Menu 
        while(true){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Check Status");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int action=sc.nextInt();

            switch(action){
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.showStatus();
                    break;
                case 5:
                    System.out.println("Goodbye! Take care of "+name+" 🐶🐱🐦");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
