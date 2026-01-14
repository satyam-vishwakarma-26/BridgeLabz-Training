package com.constructor.levelone;

public class Person {

    public String name;
    public int age;

    // parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
