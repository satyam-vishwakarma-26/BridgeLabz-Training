import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        //Taking user inputs 
        System.out.print("Enter a number: ");
        int n = inputs.nextInt();

        int factorial = 1;
        int i = n;
        //calculating factorial
        while (i >= 1) {
            factorial = factorial * i;
            i--;
        }
        //printing factorial
        System.out.println("The Factorial is: " + factorial);
    }
}
