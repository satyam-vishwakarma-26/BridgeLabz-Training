import java.util.Scanner;
public class SumofNumbersIII {

   public static void main (String [] args){
   
   
   Scanner inputs=new  Scanner(System.in);
   //making variables 
   System.out.print("Enter a number: ");
        int n = inputs.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile = sumWhile + i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            // Compare both results
            if (sumWhile == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

   }
   }
