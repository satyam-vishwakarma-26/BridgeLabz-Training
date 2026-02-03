package com.streamapi.foreachmethod;
import java.util.*;

public class IoTSensorMonitor {
    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
            18.5,
            22.0,
            27.8,
            19.4,
            30.2,
            24.6
        );

        double threshold = 25.0;

        // Print readings above threshold
        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                          System.out.println("⚠️ High Reading Detected: " + reading)
                      );
    }
}
