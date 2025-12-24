import java.util.Scanner;
public class PalindromeChecker{
    
	//take input string
    public static String takeInput(Scanner sc){
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    //check palindrome
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //display result
    public static void displayResult(String str,boolean result){
        if(result){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
    public static void main(String[] args){
	    
		//Creating Scanner class, object and taking user inputs
        Scanner sc=new Scanner(System.in);
        String str=takeInput(sc);
        boolean result=isPalindrome(str);
        displayResult(str,result);
    }
}
