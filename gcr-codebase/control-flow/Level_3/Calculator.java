import java.util.Scanner;
public class Calculator{

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter first number: ");
        double first=sc.nextDouble();
        System.out.print("Enter second number: ");
        double second=sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op=sc.next();
        
        double result;
        
        //calculator using switch case
        switch(op){
            case "+":
                result=first+second;
                System.out.println("Result: "+result);
                break;
            case "-":
                result=first-second;
                System.out.println("Result: "+result);
                break;
            case "*":
                result=first*second;
                System.out.println("Result: "+result);
                break;
            case "/":
                if(second!=0){
                    result=first/second;
                    System.out.println("Result: "+result);
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
