import java.util.Scanner;
public class StringLengthWithoutLength{

    //method to find string length without using length()
    public static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
            //exception occurs when index goes out of range
        }
        return count;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a string: ");
        String text=sc.next();
        
        //user-defined method
        int userLength=findLength(text);
        
        //built-in method
        int builtInLength=text.length();
        
        //display result
        System.out.println("Length using user-defined method: "+userLength);
        System.out.println("Length using length() method: "+builtInLength);
    }
}
