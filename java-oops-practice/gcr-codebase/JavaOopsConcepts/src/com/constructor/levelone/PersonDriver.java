package com.constructor.levelone;

public class PersonDriver {

    public static void main(String[] args) {

        // original object
        Person p1 = new Person("Satyam", 22);
        p1.display();

        System.out.println("-----");

        // cloned object
        Person p2 = new Person(p1);
        p2.display();
    }
}

