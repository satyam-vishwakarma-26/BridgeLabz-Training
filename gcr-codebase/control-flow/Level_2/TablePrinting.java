import java.util.Scanner;

public class TablePrinting {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        //Taking user inputs 
        System.out.print("Enter a Number: ");
        int number = inputs.nextInt();
		

       for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
	   
    }
}
