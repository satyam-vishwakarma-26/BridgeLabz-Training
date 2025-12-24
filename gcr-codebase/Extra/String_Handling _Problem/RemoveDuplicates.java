import java.util.Scanner;
public class RemoveDuplicates{
    public static void main(String[] args){

       //creating scanner class and object 
	   Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String result="";
		
         //remove duplicate characters
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
        System.out.println("String after removing duplicates: "+result);
    }
}
