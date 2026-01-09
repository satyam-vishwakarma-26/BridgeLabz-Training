																																				package com.Artify;
import java.util.Scanner;

public class ArtifyApp{
    public static void main(String[] args){

    	//Creating Scanner object 
        Scanner sc=new Scanner(System.in);

        //user details
        System.out.println("=== Welcome to Artify ===");
        System.out.print("Enter your name: ");
        String userName=sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance=sc.nextDouble();
        sc.nextLine();

        User user=new User(userName,balance);

        //artwork input
        System.out.println("\nChoose Artwork Type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int artChoice=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Artwork Title: ");
        String title=sc.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist=sc.nextLine();

        System.out.print("Enter Price: ");
        double price=sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter License Type: ");
        String license=sc.nextLine();

        Artwork art;
        if(artChoice==1){
            art=new DigitalArt(title,artist,price,license);
        }else{
            art=new PrintArt(title,artist,price,license);
        }

        //display
        System.out.println("\n--- Artwork Details ---");
        art.showArtwork();

        System.out.println("\n1. Purchase");
        System.out.println("2. License");
        System.out.print("Choose option: ");
        int option=sc.nextInt();

        if(option==1){
            art.purchase(user);
        }else{
            art.license(user);
        }

        System.out.println("\n--- User Summary ---");
        user.showUser();
    }
}
