import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses{
    
	//check valid parentheses
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='('&&ch==')')||
                   (s.peek()=='{'&&ch=='}')||
                   (s.peek()=='['&&ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
	
		//Creating Scanner class, object and taking user inputs 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string of brackets: ");
        String str=sc.nextLine();
        boolean result=isValid(str);
        if(result){
            System.out.println("Valid Parentheses");
        }else{
            System.out.println("Invalid Parentheses");
        }
    }
}
