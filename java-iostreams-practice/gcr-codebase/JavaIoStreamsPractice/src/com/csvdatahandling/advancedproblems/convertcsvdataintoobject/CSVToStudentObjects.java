
package com.csvdatahandling.advancedproblems.convertcsvdataintoobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {

    public static void main(String[] args) {

        String fileName = "src/com/csvdatahandling/basic_problem/studentData/student.csv" ;
        String line;

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double marks = Double.parseDouble(data[3]);

                // Create Student object
                Student student = new Student(id, name, age, marks);

                // Add to list
                students.add(student);
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }

        // Print all Student objects
        System.out.println("Student List:");
        System.out.println("----------------------");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
