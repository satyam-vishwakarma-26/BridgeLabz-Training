package com.regax.basicproblems;
import java.util.Scanner;

public class LicensePlateValidator {

	//Method for checking valid plate 
    public static boolean isValidPlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }

    //main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter license plate number which you want to match: ");
        String plate = sc.nextLine();

        if (isValidPlate(plate)) {
            System.out.println("Valid license plate");
        } else {
            System.out.println("Invalid license plate");
        }

        sc.close();
    }
}