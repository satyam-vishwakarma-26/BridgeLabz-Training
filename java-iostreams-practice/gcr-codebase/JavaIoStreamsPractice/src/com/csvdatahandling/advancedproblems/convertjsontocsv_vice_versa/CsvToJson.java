
package com.csvdatahandling.advancedproblems.convertjsontocsv_vice_versa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvToJson {

    public static void main(String[] args) {

    	String jsonFile = "src/com/csvdatahandling/advancedproblems/convertjsontocsv_vice_versa/students.json";
        String csvFile = "src/com/csvdatahandling/advancedproblems/convertjsontocsv_vice_versa/students.csv";


        try (
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            FileWriter writer = new FileWriter(jsonFile)
        ) {

            br.readLine(); // skip header

            writer.write("[\n");
            String line;
            boolean first = true;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (!first) {
                    writer.write(",\n");
                }

                writer.write(
                    "  {" +
                    "\"id\":" + data[0] + "," +
                    "\"name\":\"" + data[1] + "\"," +
                    "\"age\":" + data[2] + "," +
                    "\"marks\":" + data[3] +
                    "}"
                );

                first = false;
            }

            writer.write("\n]");
            System.out.println("CSV converted back to JSON successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
