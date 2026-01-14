package com.SkillForge;
public abstract class User{
    protected String name;
    protected String email;

    //user constructor 
    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    //showuser method 
    public void showUser(){
        System.out.println("Name  : "+name);
        System.out.println("Email : "+email);
    }
}
