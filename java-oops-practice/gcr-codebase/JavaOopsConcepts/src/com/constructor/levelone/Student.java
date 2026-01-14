package com.constructor.levelone;

public class Student {

    // public variable
    public int rollNumber;

    // protected variable
    protected String name;

    // private variable
    private double cgpa;

    // constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // display student
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
