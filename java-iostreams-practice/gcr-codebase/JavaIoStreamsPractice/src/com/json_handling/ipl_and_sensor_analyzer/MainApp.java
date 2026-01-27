
package com.json_handling.ipl_and_sensor_analyzer;

public class MainApp {

    public static void main(String[] args) {

        try {
            // JSON processing
            JsonCensorProcessor.processJson(
                "src/com/json_handling/ipl_and_sensor_analyzer/ipl_input.json",
                "src/com/json_handling/ipl_and_sensor_analyzer/ipl_censored.json"
            );

            // CSV processing
            CsvCensorProcessor.processCsv(
                "src/com/json_handling/ipl_and_sensor_analyzer/ipl_input.csv",
                "src/com/json_handling/ipl_and_sensor_analyzer/ipl_censored.csv"
            );

            System.out.println("IPL data censored successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
