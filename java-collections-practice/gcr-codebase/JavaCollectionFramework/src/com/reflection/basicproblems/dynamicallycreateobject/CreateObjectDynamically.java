
package com.reflection.basicproblems.dynamicallycreateobject;

import java.lang.reflect.Constructor;

public class CreateObjectDynamically {

    public static void main(String[] args) {
        try {
        	
            // Load Student class at runtime
            Class<?> cls = Class.forName("com.reflection.basic.dynamicallycreateobject.Student");

            // Get default constructor
            Constructor<?> constructor = cls.getDeclaredConstructor();

            // Create object without using new keyword
            Object obj = constructor.newInstance();

            // Type cast to Student
            Student student = (Student) obj;

            // Call method
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
