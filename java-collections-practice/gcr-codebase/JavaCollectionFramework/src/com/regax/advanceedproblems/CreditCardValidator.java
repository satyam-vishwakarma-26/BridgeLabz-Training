package com.regax.advanceedproblems;
import java.util.Scanner;

public class CreditCardValidator {

	//Method for checking the card Number 
    public static boolean isValidCard(String cardNumber) {
        String regex = "^(4|5)\\d{15}$";
        return cardNumber.matches(regex);
    }

    //Main Method 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String card = sc.nextLine();

        if (isValidCard(card)) {
            System.out.println("Valid Visa or MasterCard");
        } else {
            System.out.println("Invalid credit card");
        }

        sc.close();
    }
}