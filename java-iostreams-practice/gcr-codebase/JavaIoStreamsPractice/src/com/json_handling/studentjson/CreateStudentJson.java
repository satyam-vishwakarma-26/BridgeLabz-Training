
package com.json_handling.studentjson;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateStudentJson {

    public static void main(String[] args) {

        // Create JSON Array for subjects
        JSONArray subjects = new JSONArray();
        subjects.put("Math");
        subjects.put("Science");
        subjects.put("Computer");

        // Create JSON Object for student
        JSONObject student = new JSONObject();
        student.put("name", "Amit");
        student.put("age", 20);
        student.put("subjects", subjects);

        // Print JSON object
        System.out.println(student.toString(2)); // pretty print
    }
}
