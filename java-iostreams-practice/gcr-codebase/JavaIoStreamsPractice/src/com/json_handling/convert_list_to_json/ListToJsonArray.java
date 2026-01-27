
package com.json_handling.convert_list_to_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {

    public static void main(String[] args) {

        // Create list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Amit", 20));
        students.add(new Student(102, "Rahul", 21));
        students.add(new Student(103, "Neha", 19));

        try {
            ObjectMapper mapper = new ObjectMapper();

            // Convert List to JSON array string
            String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                     .writeValueAsString(students);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
