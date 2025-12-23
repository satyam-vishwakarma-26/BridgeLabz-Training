import java.util.Scanner;
public class PalindromeCheck{

    // check palindrome using start and end comparison
    public static boolean isPalindromeByLoop(String text){
        int start=0;
        int end=text.length()-1;
        
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    // check palindrome using recursion
    public static boolean isPalindromeByRecursion(String text,int start,int end){
        if(start>=end){
            return true;
        }
        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }
        return isPalindromeByRecursion(text,start+1,end-1);
    }
    
    //method to reverse string using charAt()
    public static char[] reverseString(String text){
        char reverse[]=new char[text.length()];
        int index=0;
        for(int i=text.length()-1;i>=0;i--){
            reverse[index]=text.charAt(i);
            index++;
        }
        return reverse;
    }
    
    //Logic 3: check palindrome using character arrays
    public static boolean isPalindromeByArray(String text){
        char original[]=text.toCharArray();
        char reverse[]=reverseString(text);
        
        for(int i=0;i<original.length;i++){
            if(original[i]!=reverse[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //Palindrome checks
        boolean result1=isPalindromeByLoop(text);
        boolean result2=isPalindromeByRecursion(text,0,text.length()-1);
        boolean result3=isPalindromeByArray(text);
        
        //display results
        System.out.println("Palindrome check using Loop: "+result1);
        System.out.println("Palindrome check using Recursion: "+result2);
        System.out.println("Palindrome check using Array: "+result3);
    }
}
