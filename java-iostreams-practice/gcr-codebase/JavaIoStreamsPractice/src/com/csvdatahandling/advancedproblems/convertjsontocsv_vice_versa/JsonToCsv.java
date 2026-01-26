
package com.csvdatahandling.advancedproblems.convertjsontocsv_vice_versa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonToCsv {

    public static void main(String[] args) {

        String jsonFile = "src/com/csvdatahandling/advancedproblems/convertjsontocsv_vice_versa/students.json";
        String csvFile = "src/com/csvdatahandling/advancedproblems/convertjsontocsv_vice_versa/students.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(jsonFile));
            FileWriter writer = new FileWriter(csvFile)
        ) {

            // Write CSV header
            writer.write("ID,Name,Age,Marks\n");

            String line;
            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.startsWith("{")) {
                    line = line.replace("{", "")
                               .replace("}", "")
                               .replace("\"", "");

                    String[] fields = line.split(",");

                    String id = fields[0].split(":")[1];
                    String name = fields[1].split(":")[1];
                    String age = fields[2].split(":")[1];
                    String marks = fields[3].split(":")[1];

                    writer.write(id + "," + name + "," + age + "," + marks + "\n");
                }
            }

            System.out.println("JSON converted to CSV successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
