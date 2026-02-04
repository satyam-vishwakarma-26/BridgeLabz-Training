package com.collectors.wordfrequency;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "Java is powerful and Java is popular and Java is everywhere";

        // Convert paragraph to word frequency map
        Map<String, Integer> wordFrequency =
                Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                      .collect(Collectors.toMap(
                              word -> word,      // key mapper
                              word -> 1,         // value mapper
                              Integer::sum       // merge function for duplicate keys
                      ));

        // Print result
        wordFrequency.forEach((word, count) ->
                System.out.println(word + " : " + count)
        );
    }
}
