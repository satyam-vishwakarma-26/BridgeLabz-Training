import java.util.Scanner;
public class UpperCaseConversion{

    //method to convert string to uppercase using charAt()
    public static String convertToUpperCase(String text){
        String result="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            result=result+ch;
        }
        return result;
    }
    
    //method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking complete text input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();

        String userUpper=convertToUpperCase(text);
      
        String builtInUpper=text.toUpperCase();
        
        //comparing both results
        boolean result=compareUsingCharAt(userUpper,builtInUpper);
        
        //display result
        System.out.println("Uppercase using user-defined method: "+userUpper);
        System.out.println("Uppercase using toUpperCase(): "+builtInUpper);
        
        if(result){
            System.out.println("Both results are equal");
        }else{
            System.out.println("Both results are not equal");
        }
    }
}
