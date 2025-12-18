import java.util.Scanner;
public class CheckAge {

   public static void main (String [] args){
   
   //Taking user inputs
   Scanner inputs=new  Scanner(System.in);
   System.out.print("Enter age: ");
   int age=inputs.nextInt();
   
   //checking age for voting 
   if(age>=18){
	 System.out.println("The person age is "+age+" and can vote");
   }
   else{
     System.out.println("The person age is "+age+" and can not vote");
   }
   }
}