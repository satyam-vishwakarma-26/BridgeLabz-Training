import java.util.Scanner;
public class SmallestAmongThree {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter three number: ");
   int number1=inputs.nextInt();
   int number2=inputs.nextInt();
   int number3=inputs.nextInt();
   
   if(number1>number2 && number1>number3){
     System.out.println("Is the first number the Largest?= Yes");
   }
   else if(number2>number1 && number2>number3){
     System.out.println("Is the second number the Largest?= Yes");
   }else{
     System.out.println("Is the third number the Largest?= Yes ");
     }
   }
}