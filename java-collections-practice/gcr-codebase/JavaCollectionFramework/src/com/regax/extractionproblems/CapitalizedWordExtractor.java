package com.regax.extractionproblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordExtractor {

	//Main Method 
    public static void main(String[] args) {

        String text = "The Cat Jumps on The Lazy Dog at 7: 30 .";

        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}