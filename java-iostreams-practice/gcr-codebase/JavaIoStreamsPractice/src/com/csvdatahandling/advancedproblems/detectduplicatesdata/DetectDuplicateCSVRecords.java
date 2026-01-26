
package com.csvdatahandling.advancedproblems.detectduplicatesdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSVRecords {

    public static void main(String[] args) {

        String fileName = "src/com/csvdatahandling/advanced_problem/detectduplicatesdata/student.csv";
        String line;

        // Set to store unique IDs
        Set<String> uniqueIds = new HashSet<>();

        System.out.println("Duplicate Records:");
        System.out.println("--------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                String id = data[0];

                // If ID already exists, it's a duplicate
                if (!uniqueIds.add(id)) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
