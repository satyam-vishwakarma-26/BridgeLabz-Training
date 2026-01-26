package com.regax.basicproblems;
import java.util.Scanner;

public class HexColorValidator {

	//Checking Color Validation 
    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9a-fA-F]{6}$";
        return color.matches(regex);
    }

    //Main Method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        if (isValidHexColor(color)) {
            System.out.println("Valid hex color");
        } else {
            System.out.println("Invalid hex color");
        }

        sc.close();
    }
}