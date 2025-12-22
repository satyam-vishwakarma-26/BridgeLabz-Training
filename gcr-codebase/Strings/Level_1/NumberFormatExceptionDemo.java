import java.util.Scanner;
public class NumberFormatExceptionDemo{

    //method to Exception
    public static void generateException(String text){
        int number=Integer.parseInt(text);
        System.out.println("Number: "+number);
    }
    
    //method to handle NumberFormatException
    public static void handleException(String text){
        try{
            int number=Integer.parseInt(text);
            System.out.println("Number: "+number);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException handled: Input is not a valid number");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text=sc.next();
        
        //method generate exception
        try{
            generateException(text);
        }catch(Exception e){
            System.out.println("Exception occurred while generating NumberFormatException");
        }
        
        //calling method to handle exception
        handleException(text);
    }
}
