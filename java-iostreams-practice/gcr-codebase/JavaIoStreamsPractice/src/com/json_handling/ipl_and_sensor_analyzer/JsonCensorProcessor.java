
package com.json_handling.ipl_and_sensor_analyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

import java.io.File;

public class JsonCensorProcessor {

    public static void processJson(String input, String output) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode matches = (ArrayNode) mapper.readTree(new File(input));

        ArrayNode censoredMatches = mapper.createArrayNode();

        for (JsonNode match : matches) {

            ObjectNode obj = match.deepCopy();

            // Mask teams
            obj.put("team1",
                    IPLCensorUtil.maskTeamName(match.get("team1").asText()));
            obj.put("team2",
                    IPLCensorUtil.maskTeamName(match.get("team2").asText()));

            // Redact player of match
            obj.put("player_of_match",
                    IPLCensorUtil.redactPlayer());

            censoredMatches.add(obj);
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(output), censoredMatches);
    }
}
