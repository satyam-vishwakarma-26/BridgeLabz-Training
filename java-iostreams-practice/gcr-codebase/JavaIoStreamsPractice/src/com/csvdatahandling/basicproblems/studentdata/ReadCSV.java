
package com.csvdatahandling.basicproblems.studentdata;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdatahandling/basicproblems/studentdata/student.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read header line
            br.readLine();

            System.out.println("Student Records:");
            System.out.println("----------------------------");

            // Read data lines
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double marks = Double.parseDouble(data[3]);

                // Print structured format
                System.out.println("ID    : " + id);
                System.out.println("Name  : " + name);
                System.out.println("Age   : " + age);
                System.out.println("Marks : " + marks);
                System.out.println("----------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
