
package com.reflection.basicproblems.dynamicallycreateobject;

public class Student {

    private int id;
    private String name;

    // Default constructor
    public Student() {
        this.id = 1;
        this.name = "Default Student";
    }

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
