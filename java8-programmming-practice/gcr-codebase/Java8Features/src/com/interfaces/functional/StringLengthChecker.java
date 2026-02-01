package com.interfaces.functional;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        int characterLimit = 50;

        // Function to get length of a string
        Function<String, Integer> getLength = message -> message.length();

        String message = "Functional interfaces make Java more powerful.";

        int length = getLength.apply(message);

        if (length > characterLimit) {
            System.out.println("Message exceeds character limit (" + length + "/" + characterLimit + ")");
        } else {
            System.out.println("Message is within limit (" + length + "/" + characterLimit + ")");
        }
    }
}