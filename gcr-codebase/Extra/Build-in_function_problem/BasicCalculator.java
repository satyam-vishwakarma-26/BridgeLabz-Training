import java.util.Scanner;
public class BasicCalculator{
   
   //Method for addition 
    public static double add(double a,double b){
        return a+b;
    }
  
  //Method for subtraction
    public static double subtract(double a,double b){
        return a-b;
    }
   
   //method for multiplication
    public static double multiply(double a,double b){
        return a*b;
    }
   
   //method for division
    public static double divide(double a,double b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }
   
   //taking user input
    public static double takeInput(Scanner sc,String msg){
        System.out.print(msg);
        return sc.nextDouble();
    }
	
    public static void main(String[] args){
	
		//Creating Scanner class, Object and taking user inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation: ");
        int choice=sc.nextInt();
        double a=takeInput(sc,"Enter first number: ");
        double b=takeInput(sc,"Enter second number: ");
		
		//Comparing Choices and Calling Corresponding methods
        if(choice==1){
            System.out.println("Result: "+add(a,b));
        }else if(choice==2){
            System.out.println("Result: "+subtract(a,b));
        }else if(choice==3){
            System.out.println("Result: "+multiply(a,b));
        }else if(choice==4){
            System.out.println("Result: "+divide(a,b));
        }else{
            System.out.println("Invalid choice");
        }
    }
}
