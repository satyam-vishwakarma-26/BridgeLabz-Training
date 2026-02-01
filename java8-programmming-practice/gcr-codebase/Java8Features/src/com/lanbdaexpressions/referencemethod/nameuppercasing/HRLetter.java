package com.lanbdaexpressions.referencemethod.nameuppercasing;
import java.util.*;
import java.util.stream.Collectors;

public class HRLetter {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
            "Rahul", "Anita", "Vikram", "Sneha"
        );

        List<String> upperCaseNames = employeeNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}