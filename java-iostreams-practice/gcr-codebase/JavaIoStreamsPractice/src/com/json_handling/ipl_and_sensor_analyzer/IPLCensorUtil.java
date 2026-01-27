
package com.json_handling.ipl_and_sensor_analyzer;

public class IPLCensorUtil {

    // Mask team name: keep first word
    public static String maskTeamName(String teamName) {
        if (teamName == null || !teamName.contains(" ")) {
            return "***";
        }
        return teamName.split(" ")[0] + " ***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}
