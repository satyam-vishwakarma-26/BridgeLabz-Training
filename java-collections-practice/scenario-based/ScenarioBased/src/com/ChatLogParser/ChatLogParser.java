package com.ChatLogParser;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    public static void main(String[] args) {

        TreeMap<String, List<String>> userMessages = new TreeMap<>();
        MessageFilter<String> filter = new IdleChatFilter();

        try (BufferedReader br =
                     new BufferedReader(new FileReader("chatlog.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    ChatEntry entry = parseLine(line);

                    // Apply filter
                    if (filter.allow(entry.message)) {
                        userMessages
                            .computeIfAbsent(entry.user, k -> new ArrayList<>())
                            .add(entry.message);
                    }

                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display result
        System.out.println("\n--- Chat Analysis ---");
        userMessages.forEach((user, msgs) -> {
            System.out.println("\n" + user + ":");
            msgs.forEach(m -> System.out.println("  " + m));
        });
    }

    // Regex parsing
    private static ChatEntry parseLine(String line) throws Exception {
        String regex = "\\[(.*?)] (.*?): (.*)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(line);

        if (m.find()) {
            String time = m.group(1);
            String user = m.group(2);
            String msg = m.group(3);
            return new ChatEntry(time, user, msg);
        } else {
            throw new Exception("Invalid format");
        }
    }
}
