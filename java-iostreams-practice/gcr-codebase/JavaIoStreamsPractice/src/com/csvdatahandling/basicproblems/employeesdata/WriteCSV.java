package com.csvdatahandling.basicproblems.employeesdata;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        String fileName = "src/com/csvdatahandling/basicproblems/employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Write header
            writer.append("ID,Name,Department,Salary\n");

            // Write employee records
            writer.append("101,Amit,IT,55000\n");
            writer.append("102,Rahul,HR,48000\n");
            writer.append("103,Neha,Finance,62000\n");
            writer.append("104,Priya,Marketing,50000\n");
            writer.append("105,Karan,Sales,47000\n");

            System.out.println("CSV file written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
            e.printStackTrace();
        }
    }
}