package com.CampusConnect;
import java.util.ArrayList;


/* ---------- Base Class ---------- */
class Person{
    protected int id;
    protected String name;
    protected String email;

    public Person(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    //polymorphic method
    public void printDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}