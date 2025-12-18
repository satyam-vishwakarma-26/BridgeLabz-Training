import java.util.Scanner;
public class QuotientReminder{
 public static void main(String [] args){
 
Scanner inputs=new Scanner(System.in);
//Taking user inputs 
System.out.println("Enter two number: ");
 int number1=inputs.nextInt();
 int number2=inputs.nextInt();

int quotient=number1/number2;
int reminder=number2/number2;

 System.out.println("The Quotient is: "+quotient+" and reminder is "+reminder+" of two number "+number1+" and "+number2);
}
}