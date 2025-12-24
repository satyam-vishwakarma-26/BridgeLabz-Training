import java.util.Scanner;
public class PalindromeString{
    public static void main(String[] args){
       //creating scanner class and objects
	   Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
       
	   String rev="";
        //reverse the string
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        //check palindrome
        if(str.equals(rev)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }
}
