
package com.reflection.advanced.generatejsonrepresentation;

public class TestJsonGenerator {

    public static void main(String[] args) {

        Student student = new Student(101, "Amit", 88.5);

        String json = JsonUtil.toJson(student);

        System.out.println(json);
    }
}
