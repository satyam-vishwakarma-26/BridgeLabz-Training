
package com.csvdatahandling.basicproblems.countrow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

    	String fileName = "src/com/csvdatahandling/basicproblems/countRow/employees.csv";

        String line;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header row
            br.readLine();

            // Count remaining rows
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Number of records (excluding header): " + count);

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
