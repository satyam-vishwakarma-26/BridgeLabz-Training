package com.ResumeAnalyzer;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

    // Keywords to search
    static String[] keywords = {"Java", "Python", "Spring"};

    public static void main(String[] args) {

        File folder = new File("resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        List<ResumeData> resumeList = new ArrayList<>();

        // Read all files from folder
        for (File file : folder.listFiles()) {
            try {
                if (!file.getName().endsWith(".txt"))
                    throw new Exception("Invalid file format");

                String content = readFile(file);

                String email = extractEmail(content);
                String phone = extractPhone(content);
                int count = countKeywords(content);

                ResumeData data = new ResumeData(email, phone, count);
                resumeMap.put(email, data);
                resumeList.add(data);

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName());
            }
        }

        // Sort by keyword count (descending)
        resumeList.sort((a, b) -> b.keywordCount - a.keywordCount);

        // Display result
        System.out.println("\nSorted Candidates:");
        for (ResumeData r : resumeList) {
            System.out.println(r.email + " | " + r.phone + 
                               " | Matches: " + r.keywordCount);
        }
    }

    // Read file content
    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    // Extract email using regex
    private static String extractEmail(String text) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");
        Matcher m = p.matcher(text);
        return m.find() ? m.group() : "Not Found";
    }

    // Extract phone using regex
    private static String extractPhone(String text) {
        Pattern p = Pattern.compile("\\d{10}");
        Matcher m = p.matcher(text);
        return m.find() ? m.group() : "Not Found";
    }

    // Count keyword matches
    private static int countKeywords(String text) {
        int count = 0;
        for (String key : keywords) {
            Pattern p = Pattern.compile(key, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(text);
            while (m.find()) count++;
        }
        return count;
    }
}
