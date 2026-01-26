
package com.csvdatahandling.advancedproblems.validatecsvdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private static final String PHONE_REGEX =
            "^[0-9]{10}$";

    public static void main(String[] args) {

        String line;

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    ValidateCSVData.class
                        .getResourceAsStream("employee.csv")
                )
            )
        ) {

            // Skip header
            br.readLine();

            System.out.println("Invalid Records:");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println(
                        "ID " + id + " (" + name + "): Invalid Email -> " + email
                    );
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println(
                        "ID " + id + " (" + name + "): Invalid Phone -> " + phone
                    );
                    valid = false;
                }

                if (!valid) {
                    System.out.println("--------------------------------");
                }
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
