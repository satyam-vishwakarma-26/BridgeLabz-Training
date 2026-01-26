
package com.csvdatahandling.intermediate.updatedrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

    public static void main(String[] args) {

        String inputFile =  "src/com/csvdatahandling/intermediate/searchrecord/employees.csv";
        String outputFile = "src/com/csvdatahandling/intermediate/updaterecord/employees_updated.csv";
        String line;

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {

            // Read and write header
            String header = br.readLine();
            writer.append(header).append("\n");

            // Read remaining rows
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                writer.append(id + "," + name + "," + department + "," + salary + "\n");
            }

            System.out.println("Updated CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error processing CSV file");
            e.printStackTrace();
        }
    }
}
