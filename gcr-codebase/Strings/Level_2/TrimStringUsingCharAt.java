import java.util.Scanner;
public class TrimStringUsingCharAt{

    //method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text){
        int start=0;
        int end=0;
        
        //find start index (first non-space)
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)!=' '){
                start=i;
                break;
            }
        }
        
        //find end index (last non-space)
        for(int i=text.length()-1;i>=0;i--){
            if(text.charAt(i)!=' '){
                end=i+1;
                break;
            }
        }
        return new int[]{start,end};
    }
    
    //method to create substring using charAt()
    public static String createSubstring(String text,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result=result+text.charAt(i);
        }
        return result;
    }
    
    //method to compare two strings using charAt()
    public static boolean compareStrings(String s1,String s2){
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
        
        //finding trim indexes
        int index[]=findTrimIndexes(text);
        
        //user-defined trimmed string
        String userTrim=createSubstring(text,index[0],index[1]);
        
        //built in trim
        String builtInTrim=text.trim();
        
        //compare results
        boolean result=compareStrings(userTrim,builtInTrim);
        
        //display result
        System.out.println("Trimmed using user-defined method: '"+userTrim+"'");
        System.out.println("Trimmed using trim(): '"+builtInTrim+"'");
        
        if(result){
            System.out.println("Both results are equal");
        }else{
            System.out.println("Both results are not equal");
        }
    }
}
