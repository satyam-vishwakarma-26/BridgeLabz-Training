import java.util.Scanner;
public class NumberDivisibility{
public static void main(String [] args){

//Taking a number from the user which need to check
Scanner inputs=new Scanner(System.in);
System.out.print("Enter number which need to check: ");
int number=inputs.nextInt();

//checking the number divisibility
if(number%5==0){
   System.out.println(number+" Number is Divisible by 5");
}else{
   System.out.println(number+" Number is not Divisible by 5" );
     }
  }
}