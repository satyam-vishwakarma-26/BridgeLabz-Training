
package com.reflection.basicproblems.accesprivatefield;

public class Person {

    // Private field
    private int age;

    // Constructor
    public Person() {
        age = 18;
    }

    // Normal method (not used by reflection)
    public int getAge() {
        return age;
    }
}
