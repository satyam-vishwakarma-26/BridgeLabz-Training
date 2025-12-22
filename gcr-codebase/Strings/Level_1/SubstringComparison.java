import java.util.Scanner;
public class SubstringComparison{

    //method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result=result+text.charAt(i);
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
        
        //Taking user inputs
        System.out.print("Enter the string, start index, end index: ");
        String text=sc.next();  
        int start=sc.nextInt(); 
        int end=sc.nextInt();
        
        //substring using charAt()
        String subCharAt=createSubstringUsingCharAt(text,start,end);
        
        //substring using built-in method
        String subBuiltIn=text.substring(start,end);
        
        //comparing both substrings
        boolean result=compareUsingCharAt(subCharAt,subBuiltIn);
        
        //display results
        System.out.println("Substring using charAt(): "+subCharAt);
        System.out.println("Substring using substring(): "+subBuiltIn);
        
        if(result){
            System.out.println("Both substrings are equal");
        }else{
            System.out.println("Both substrings are not equal");
        }
    }
}
