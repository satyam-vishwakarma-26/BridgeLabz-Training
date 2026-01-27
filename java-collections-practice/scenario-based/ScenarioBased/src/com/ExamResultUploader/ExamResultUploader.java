package com.ExamResultUploader;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader {

    public static void main(String[] args) {

        Map<String, List<Integer>> subjectMap = new HashMap<>();
        PriorityQueue<ExamRecord<String>> pq =
                new PriorityQueue((a, b) -> b.marks - a.marks);

        try (BufferedReader br =
                new BufferedReader(new FileReader("marks.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    if (!isValid(line))
                        throw new InvalidRecordException("Invalid format");

                    String[] parts = line.split(",");
                    int roll = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String subject = parts[2];
                    int marks = Integer.parseInt(parts[3]);

                    ExamRecord<String> record =
                        new ExamRecord<>(roll, name,
                                "Final", subject, marks);

                    subjectMap
                        .computeIfAbsent(subject, k -> new ArrayList<>())
                        .add(marks);

                    pq.add(record);

                } catch (Exception e) {
                    System.out.println("Skipping line: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display subject-wise marks
        System.out.println("\nSubject-wise Marks:");
        subjectMap.forEach((k, v) ->
                System.out.println(k + " -> " + v));

        // Top scorer per subject
        System.out.println("\nTop Scorers:");
        findTopScorers(pq);
    }

    // Regex validation
    private static boolean isValid(String line) {
        // Roll,Name,Subject,Marks(0-100)
        String regex = "\\d+,[A-Za-z ]+,[A-Za-z]+,\\d{1,3}";
        return Pattern.matches(regex, line);
    }

    // Find top scorer
    private static void findTopScorers(
            PriorityQueue<ExamRecord<String>> pq) {

        Map<String, ExamRecord<String>> topMap = new HashMap<>();

        while (!pq.isEmpty()) {
            ExamRecord<String> r = pq.poll();
            topMap.putIfAbsent(r.subject, r);
        }

        topMap.forEach((k, v) ->
            System.out.println(k + " -> " +
                               v.name + " (" + v.marks + ")"));
    }
}
