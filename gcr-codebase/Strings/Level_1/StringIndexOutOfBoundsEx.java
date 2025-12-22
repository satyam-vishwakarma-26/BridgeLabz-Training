import java.util.Scanner;
public class StringIndexOutOfBoundsEx{

    //method to generate StringIndexOutOfBoundsException
    public static void generateException(String text){
        //accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }
    
    //method to handle StringIndexOutOfBoundsException
    public static void handleException(String text){
	
        try{
            System.out.println(text.charAt(text.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled Index is out of Bounds");
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
            System.out.println("Exception occurred while generating StringIndexOutOfBoundsException");
        }
        
        //calling method to handle exception
        handleException(text);
    }
}
