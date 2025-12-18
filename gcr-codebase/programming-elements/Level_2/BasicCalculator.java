import java.util.Scanner;
public class BasicCalculator{
 public static void main(String [] args){
 
//Scanner class for user inputs
 Scanner inputs=new Scanner (System.in);
// Taking first Number as input
System.out.print("Enter First Number: ");
 double Number_1=inputs.nextDouble();
// Taking Second Number as input
System.out.print("Enter Second Number: ");
 double Number_2=inputs.nextDouble();

//Addition 
  double Addition=Number_1+Number_2;
//Subtraction
  double Subtraction=Number_1-Number_2;
//Multiplication
  double Multiplication=Number_1*Number_2;
//Division
  double Division=Number_1/Number_2;

//Printing Values
 System.out.println("The addition, subtraction, multiplication and division value of 2 numbers:"+Number_1+" and "+Number_2+ "is"+ Addition+" , "+ Subtraction+" , "+Multiplication+ "and"+ Division);


  }
}