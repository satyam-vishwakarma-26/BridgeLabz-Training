package com.ArtExpo;

// Represents an artist registration
public class Artist{
    String name;
    int registrationTime;
    public Artist(String name,int registrationTime){
        this.name=name;
        this.registrationTime=registrationTime;
    }

    // Display artist details
    public void display(){
        System.out.println(name+" | Time: "+registrationTime);
    }
}
