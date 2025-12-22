import java.util.Scanner;
public class VowelConsonantCounter{

    //method to check character type
    public static int checkCharacter(char ch){
        //convert uppercase to lowercase using ASCII
        if(ch>='A'&&ch<='Z'){
            ch=(char)(ch+32);
        }
        
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return 1;
            }else{
                return 2;
            }
        }
        return 0;
    }
    
    //method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text){
        int vowelCount=0;
        int consonantCount=0;
        
        for(int i=0;i<text.length();i++){
            int result=checkCharacter(text.charAt(i));
            if(result==1){
                vowelCount++;
            }else if(result==2){
                consonantCount++;
            }
        }
        return new int[]{vowelCount,consonantCount};
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //method call
        int count[]=countVowelsAndConsonants(text);
        
        //display result
        System.out.println("Vowel Count: "+count[0]);
        System.out.println("Consonant Count: "+count[1]);
    }
}
