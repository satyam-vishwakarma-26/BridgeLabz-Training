
package com.json_handling.ipl_and_sensor_analyzer;

import java.io.*;

public class CsvCensorProcessor {

    public static void processCsv(String input, String output) throws Exception {

        try (
            BufferedReader br = new BufferedReader(new FileReader(input));
            FileWriter writer = new FileWriter(output)
        ) {

            // Write header
            writer.write(br.readLine() + "\n");

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                data[1] = IPLCensorUtil.maskTeamName(data[1]); // team1
                data[2] = IPLCensorUtil.maskTeamName(data[2]); // team2
                data[4] = IPLCensorUtil.redactPlayer();       // player

                writer.write(String.join(",", data) + "\n");
            }
        }
    }
}
