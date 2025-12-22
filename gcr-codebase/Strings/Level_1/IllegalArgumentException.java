import java.util.Scanner;
public class IllegalArgumentException{

    //method to generate IllegalArgumentException
    public static void generateException(String text){
        //start index is greater than end index
        System.out.println(text.substring(5,2));
    }
    
    //method to handle Excetion
    public static void handleException(String text){
        try{
            System.out.println(text.substring(5,2));
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException handled, Start index is greater than end index");
        }catch(RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a string: ");
        String text=sc.next();
        
        //calling method to generate exception
        try{
            generateException(text);
        }catch(Exception e){
            System.out.println("Exception occurred while generating IllegalArgumentException");
        }
        
        //calling method to handle exception
        handleException(text);
    }
}
