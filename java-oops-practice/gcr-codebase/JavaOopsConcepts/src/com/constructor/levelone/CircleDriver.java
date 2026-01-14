package com.constructor.levelone;

public class CircleDriver {

    public static void main(String[] args) {

        // using default constructor
        Circle c1 = new Circle();
        c1.display();

        // using parameterized constructor
        Circle c2 = new Circle(7.0);
        c2.display();
    }
}

