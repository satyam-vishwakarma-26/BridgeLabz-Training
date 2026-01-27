
package com.json_handling.validate_jsonsyntax;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonSyntax {

    public static void main(String[] args) {

        String json = "{ \"name\":\"Amit\", \"age\":20, \"email\":\"amit@gmail.com\" }";

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(json);   // parses JSON
            System.out.println("Valid JSON structure");
        } catch (Exception e) {
            System.out.println("Invalid JSON structure");
        }
    }
}
