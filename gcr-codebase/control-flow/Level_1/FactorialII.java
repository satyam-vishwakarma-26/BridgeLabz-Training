import java.util.Scanner;

public class FactorialII {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        //Taking user inputs 
        System.out.print("Enter a number: ");
        int n = inputs.nextInt();

        int factorial = 1;
       for(int i=n;i>1;i--){
            factorial = factorial * i;
        }
        //printing factorial
        System.out.println("The Factorial is: " + factorial);
    }
}
