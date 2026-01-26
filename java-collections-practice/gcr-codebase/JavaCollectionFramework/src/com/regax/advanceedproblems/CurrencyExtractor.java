package com.regax.advanceedproblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {

	//Main Method 
    public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        String regex = "\\$?\\d+\\.\\d{2}";

        //Checking The Pattern And Matching Them 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}