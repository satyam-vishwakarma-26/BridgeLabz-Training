
package com.reflection.advanced.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class TestObjectMapper {

    public static void main(String[] args) {

        // Create property map
        Map<String, Object> map = new HashMap<>();
        map.put("id", 101);
        map.put("name", "Amit");
        map.put("marks", 88.5);

        // Convert map to Student object
        Student student =
                ObjectMapperUtil.toObject(Student.class, map);

        // Display object data
        student.display();
    }
}
