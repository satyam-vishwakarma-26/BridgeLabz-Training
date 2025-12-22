import java.util.Scanner;
public class CharArrayComparison{

    //method to return characters of string without using toCharArray()
    public static char[] getCharsUsingCharAt(String text){
        char result[]=new char[text.length()];
        for(int i=0;i<text.length();i++){
            result[i]=text.charAt(i);
        }
        return result;
    }
    
    //method to compare two char arrays
    public static boolean compareCharArrays(char a[],char b[]){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter a string: ");
        String text=sc.next();
        
        char userArray[]=getCharsUsingCharAt(text);
      
        char builtInArray[]=text.toCharArray();
        
        //compare both arrays
        boolean result=compareCharArrays(userArray,builtInArray);
        
        //display result
        System.out.print("Characters using user-defined method: ");
        for(int i=0;i<userArray.length;i++){
            System.out.print(userArray[i]+" ");
        }
        System.out.println();
        
        System.out.print("Characters using toCharArray(): ");
        for(int i=0;i<builtInArray.length;i++){
            System.out.print(builtInArray[i]+" ");
        }
        System.out.println();
        
        if(result){
            System.out.println("Both character arrays are equal");
        }else{
            System.out.println("Character arrays are not equal");
        }
    }
}
