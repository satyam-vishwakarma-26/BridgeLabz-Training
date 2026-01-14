package com.FitTrack;

public class UserProfile{
    private String name;
    private int age;
    private double weight; //private health data
    private String goal;

    //default goal constructor
    public UserProfile(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.goal="Stay Fit";
    }

    //custom goal constructor
    public UserProfile(String name,int age,double weight,String goal){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.goal=goal;
    }

    public double getWeight(){
        return weight;
    }

    //Print the profile when method is called 
    public void showProfile(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Goal: "+goal);
    }
}
