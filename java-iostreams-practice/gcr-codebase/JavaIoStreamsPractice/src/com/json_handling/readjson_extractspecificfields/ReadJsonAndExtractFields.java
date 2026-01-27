
package com.json_handling.readjson_extractspecificfields;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonAndExtractFields {

    public static void main(String[] args) {

        String fileName = "src/com/json_handling/readjson_extractspecificfields/students.json";
        StringBuilder jsonContent = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            // Convert file content to JSON array
            JSONArray studentsArray = new JSONArray(jsonContent.toString());

            System.out.println("Extracted Fields (Name & Email):");
            System.out.println("--------------------------------");

            for (int i = 0; i < studentsArray.length(); i++) {

                JSONObject student = studentsArray.getJSONObject(i);

                String name = student.getString("name");
                String email = student.getString("email");

                System.out.println("Name  : " + name);
                System.out.println("Email : " + email);
                System.out.println("--------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading JSON file");
            e.printStackTrace();
        }
    }
}
