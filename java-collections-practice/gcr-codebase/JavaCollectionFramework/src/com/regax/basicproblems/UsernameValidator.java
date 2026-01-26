package com.regax.basicproblems;
import java.util.Scanner;

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        // Must start with a letter, allowed chars, length 5–15
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    //Main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}