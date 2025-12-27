package com.constructor.levelone;

public class Circle {

    public double radius;

    // default constructor
    public Circle() {
        this(1.0);   // constructor chaining
    }

    // parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // display radius
    public void display() {
        System.out.println("Radius: " + radius);
    }
}

