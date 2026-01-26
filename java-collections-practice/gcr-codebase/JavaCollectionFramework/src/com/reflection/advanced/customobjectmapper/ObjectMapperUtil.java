
package com.reflection.advanced.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {

    // Convert Map to Object using Reflection
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

        try {
            // Create object using default constructor
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Iterate over map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {

                String fieldName = entry.getKey();
                Object value = entry.getValue();

                // Get field from class
                Field field = clazz.getDeclaredField(fieldName);

                // Allow access to private field
                field.setAccessible(true);

                // Set field value
                field.set(obj, value);
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
}
