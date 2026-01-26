
package com.reflection.intermediate.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class AccessStaticField {

    public static void main(String[] args) {

        try {
            // Load Configuration class
            Class<?> cls = Class.forName("com.reflection.intermediate.accessandmodifystaticfields.Configuration");

            // Get private static field API_KEY
            Field field = cls.getDeclaredField("API_KEY");

            // Allow access to private field
            field.setAccessible(true);

            // Modify static field value (object reference is null)
            field.set(null, "NEW_API_KEY_123");

            // Read modified value
            String value = (String) field.get(null);

            // Print value
            System.out.println("API_KEY: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
