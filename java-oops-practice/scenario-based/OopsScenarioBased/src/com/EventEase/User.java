package com.EventEase;

public class User{
	
	//sensitive data 
    private String name;
    private String email; 

    //Create the user constructor for object initialization 
    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public void showUser(){
        System.out.println("Organizer Name: "+name);
        System.out.println("Email: "+email);
    }
}
