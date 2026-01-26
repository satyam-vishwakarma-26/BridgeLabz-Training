
package com.reflection.basicproblems.getclassinformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take class name as input
            System.out.print("Enter full class name: ");
            String className = sc.nextLine();

            // Load class at runtime
            Class<?> cls = Class.forName(className);

            // Print class name
            System.out.println("\nClass Name: " + cls.getName());

            // Print constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }

            // Print fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            // Print methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } finally {
            sc.close();
        }
    }
}
