
package com.reflection.advanced.customobjectmapper;

public class Student {

    private int id;
    private String name;
    private double marks;

    public Student() {
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
