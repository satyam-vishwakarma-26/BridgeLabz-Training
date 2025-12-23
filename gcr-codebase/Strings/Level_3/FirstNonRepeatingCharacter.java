import java.util.Scanner;
public class FirstNonRepeatingCharacter{

    //method to find first non repeating character using charAt()
    public static char findFirstNonRepeatingChar(String text){
        int freq[]=new int[256]; //ASCII character frequency
        
        //count frequency of each character
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //find first non-repeating character
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]==1){
                return text.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //method calling 
        char result=findFirstNonRepeatingChar(text);
        
        //display result
        if(result!='\0'){
            System.out.println("First non-repeating character: "+result);
        }else{
            System.out.println("No non-repeating character found");
        }
    }
}
