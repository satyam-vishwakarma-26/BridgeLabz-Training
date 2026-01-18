package com.collections.map;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    // counts word frequency ignoring case and punctuation
    public static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z ]", "");
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close();
        return map;
    }

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        try {
            Map<String, Integer> result = countWords(filePath);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        sc.close();
    }
}