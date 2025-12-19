import java.util.Scanner;
public class SumofNumbersIV {

   public static void main (String [] args){
   
   
   Scanner inputs=new  Scanner(System.in);
   //making variables 
   System.out.print("Enter a number: ");
        int n = inputs.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int sumFor = 0;
           for(int i=1;i<n;i++){
			   sumFor+=n;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            // Compare both results
            if (sumFor == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

   }
   }
