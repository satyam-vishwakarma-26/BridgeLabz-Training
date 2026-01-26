
package com.csvdatahandling.advancedproblems.readlargecsvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVInChunks {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String fileName = "large_students.csv"; // large CSV file
        String line;
        int totalRecords = 0;

        List<String> buffer = new ArrayList<>(CHUNK_SIZE);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                buffer.add(line);
                totalRecords++;

                // Process when buffer reaches 100 lines
                if (buffer.size() == CHUNK_SIZE) {
                    processChunk(buffer);
                    buffer.clear();
                    System.out.println("Processed records: " + totalRecords);
                }
            }

            // Process remaining lines (if any)
            if (!buffer.isEmpty()) {
                processChunk(buffer);
                System.out.println("Processed records: " + totalRecords);
            }

            System.out.println("Finished processing file.");
            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file");
            e.printStackTrace();
        }
    }

    // Dummy processing logic
    private static void processChunk(List<String> chunk) {
        // Example: just simulate processing
        // Real logic could be validation, DB insert, etc.
    }
}
