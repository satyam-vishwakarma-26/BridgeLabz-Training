
package com.csvdatahandling.intermediate.sortedrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCSVBySalary {

    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        String fileName = "src/com/csvdatahandling/intermediate/sortedrecords/employees.csv";
        String line;
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            // Read CSV records
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }

            // Sort by salary in descending order
            employees.sort(
                Comparator.comparingDouble((Employee e) -> e.salary).reversed()
            );

            // Print top 5 highest-paid employees
            System.out.println("Top 5 Highest-Paid Employees:");
            System.out.println("--------------------------------");

            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                Employee e = employees.get(i);

                System.out.println("ID         : " + e.id);
                System.out.println("Name       : " + e.name);
                System.out.println("Department : " + e.department);
                System.out.println("Salary     : " + e.salary);
                System.out.println("--------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
