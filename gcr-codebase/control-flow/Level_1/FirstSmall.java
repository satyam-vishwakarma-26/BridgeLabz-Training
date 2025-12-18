import java.util.Scanner;
public class FirstSmall {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter three number");
   int number1=inputs.nextInt();
   int number2=inputs.nextInt();
   int number3=inputs.nextInt();
   
   if(number1<number2 && number1<number3){
     System.out.println(number1+" is the smallest among three");
   }
   else{
     System.out.println(number1+" is not the smallest among three");
   }
   }
}