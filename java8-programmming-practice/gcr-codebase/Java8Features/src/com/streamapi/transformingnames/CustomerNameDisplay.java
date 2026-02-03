package com.streamapi.transformingnames;
import java.util.*;

public class CustomerNameDisplay {
    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
            "Ravi",
            "Anita",
            "john",
            "Meera",
            "alex"
        );

        customerNames.stream()

            // 1️ Convert names to uppercase
            .map(String::toUpperCase)

            // 2️ Sort alphabetically
            .sorted()

            // Output
            .forEach(System.out::println);
    }
}
