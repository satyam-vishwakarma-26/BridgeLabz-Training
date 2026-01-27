package com.ExamScanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    // Answer key
    static String[] answerKey = {"A","B","C","D","A","B","C"};

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue((a,b) -> b.getValue() - a.getValue());

        try (BufferedReader br = new BufferedReader(
                new FileReader("answers.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    if (!isValidFormat(line))
                        throw new Exception("Invalid format");

                    String[] parts = line.split(",");
                    String name = parts[0];
                    String[] answers = Arrays.copyOfRange(parts, 1, parts.length);

                    AnswerSheet<String> sheet =
                            new AnswerSheet<>(name, "Math", answers);

                    int score = calculateScore(sheet.answers);
                    scoreMap.put(name, score);

                } catch (Exception e) {
                    System.out.println("Skipping line: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Sort using PriorityQueue
        pq.addAll(scoreMap.entrySet());

        System.out.println("\n--- Ranked Results ---");
        while (!pq.isEmpty()) {
            var entry = pq.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Validate line using regex
    private static boolean isValidFormat(String line) {
        // Name followed by 7 answers A-D
        String regex = "[A-Za-z ]+(,[A-D]){7}";
        return Pattern.matches(regex, line);
    }

    // Score calculation
    private static int calculateScore(String[] answers) {
        int score = 0;
        for (int i = 0; i < answerKey.length; i++) {
            if (answers[i].equals(answerKey[i]))
                score++;
        }
        return score;
    }
}
