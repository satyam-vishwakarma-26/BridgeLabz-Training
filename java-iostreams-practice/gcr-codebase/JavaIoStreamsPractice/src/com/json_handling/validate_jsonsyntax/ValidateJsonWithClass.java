
package com.json_handling.validate_jsonsyntax;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonWithClass {

    public static void main(String[] args) {

        String json = "{ \"name\":\"Amit\", \"age\":20, \"email\":\"amit@gmail.com\" }";

        ObjectMapper mapper = new ObjectMapper();

        try {
            Student student = mapper.readValue(json, Student.class);
            System.out.println("JSON structure is valid");
        } catch (Exception e) {
            System.out.println("JSON structure is invalid");
            e.printStackTrace();
        }
    }
}
