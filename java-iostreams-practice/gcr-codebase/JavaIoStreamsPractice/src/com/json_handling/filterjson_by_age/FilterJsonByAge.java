
package com.json_handling.filterjson_by_age;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJsonByAge {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON file
            JsonNode rootArray = mapper.readTree(new File("src/com/json_handling/filterjson_by_age/students.json"));

            System.out.println("Students with age > 25:");
            System.out.println("-----------------------");

            // Iterate over JSON array
            for (JsonNode student : rootArray) {

                int age = student.get("age").asInt();

                if (age > 25) {
                    System.out.println("Name : " + student.get("name").asText());
                    System.out.println("Age  : " + age);
                    System.out.println("-----------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
