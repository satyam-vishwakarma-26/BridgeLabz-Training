
package com.reflection.basicproblems.getclassinformation;

public class Student {

    // Fields
    private int id;
    private String name;
    private double marks;

    // Default constructor
    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.marks = 0.0;
    }

    // Parameterized constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Methods

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public double getMarks() {
        return marks;
    }

    private void privateMethodExample() {
        System.out.println("This is a private method");
    }
}
