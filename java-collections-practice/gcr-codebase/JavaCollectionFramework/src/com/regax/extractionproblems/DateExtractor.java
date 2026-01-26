package com.regax.extractionproblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

    public static void main(String[] args) {

        String text = "The events are scheduled for 12/05/2026, 15/08/2027, and 29/02/2026.";

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
