package com.FeedbackGuru;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru {

    public static void main(String[] args) {

        File folder = new File("feedbacks");
        Map<String, List<String>> categoryMap = new HashMap<>();

        categoryMap.put("Positive", new ArrayList<>());
        categoryMap.put("Neutral", new ArrayList<>());
        categoryMap.put("Negative", new ArrayList<>());

        // Read all files
        for (File file : folder.listFiles()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        int rating = extractRating(line);
                        String category = classify(rating);
                        categoryMap.get(category).add(line);
                    } catch (Exception e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }

        // Display result
        System.out.println("\n--- Feedback Summary ---");
        categoryMap.forEach((k, v) -> {
            System.out.println("\n" + k + " Feedback:");
            v.forEach(System.out::println);
        });
    }

    // Extract rating using regex
    private static int extractRating(String text) throws Exception {
        Pattern p = Pattern.compile("(\\d)/10");
        Matcher m = p.matcher(text);
        if (m.find())
            return Integer.parseInt(m.group(1));
        else
            throw new Exception("Rating not found");
    }

    // Classify based on rating
    private static String classify(int rating) {
        if (rating >= 8) return "Positive";
        else if (rating >= 5) return "Neutral";
        else return "Negative";
    }
}
