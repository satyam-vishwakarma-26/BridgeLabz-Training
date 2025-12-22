import java.util.Scanner;
public class StringComparison{

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
        
        //Taking user inputs
        System.out.print("Enter first string: ");
        String str1=sc.next();
        System.out.print("Enter second string: ");
        String str2=sc.next();
        
        //method call
        boolean charAtResult=compareUsingCharAt(str1,str2);
        boolean equalsResult=str1.equals(str2);
        
        //display result
        System.out.println("Result using charAt(): "+charAtResult);
        System.out.println("Result using equals(): "+equalsResult);
        
        if(charAtResult==equalsResult){
            System.out.println("Both results are same");
        }else{
            System.out.println("Results are different");
        }
    }
}
