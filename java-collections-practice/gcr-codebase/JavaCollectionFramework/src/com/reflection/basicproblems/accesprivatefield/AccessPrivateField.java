package com.reflection.basicproblems.accesprivatefield;

import java.lang.reflect.Field;

import com.reflection.basic.getclassinformation.Student;

public class AccessPrivateField {

    public static void main(String[] args) {
        try {
            // Create object of Person
            Person p = new Person();

            // Get Class object
            Class<?> cls = p.getClass();

            // Get private field "age"
            Field field = cls.getDeclaredField("age");

            // Make private field accessible
            field.setAccessible(true);

            // Modify private field value
            field.setInt(p, 25);

            // Retrieve private field value
            int value = field.getInt(p);

            // Print value
            System.out.println("Age after modification: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}