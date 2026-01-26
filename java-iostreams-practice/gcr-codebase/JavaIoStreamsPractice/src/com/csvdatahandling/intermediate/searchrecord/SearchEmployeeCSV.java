
package com.csvdatahandling.intermediate.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {

    public static void main(String[] args) {

        String fileName = "src/com/csvdatahandling/intermediate/searchrecord/employees.csv";
        String line;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                String name = data[1];

                // Compare names (case-insensitive)
                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    System.out.println("\nEmployee Found");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nEmployee not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
