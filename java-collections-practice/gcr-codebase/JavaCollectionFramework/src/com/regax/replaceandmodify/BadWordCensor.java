package com.regax.replaceandmodify;
public class BadWordCensor {

    public static void main(String[] args) {

        String input = "This is a damn bad example with some stupid words.";

        // List of bad words written in plan text 
        String badWordsRegex = "\\b(damn|stupid)\\b";

        // Replace bad words with ****
        String removeBadWord = input.replaceAll("(?i)" + badWordsRegex, "****");

        System.out.println(removeBadWord);
    }
}