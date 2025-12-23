import java.util.Scanner;
public class CharacterFrequencyUsingUnique{

    //method to find unique characters using method
    public static char[] findUniqueCharacters(String text){
        char temp[]=new char[text.length()];
        int uniqueCount=0;
        
        for(int i=0;i<text.length();i++){
            char current=text.charAt(i);
            boolean isUnique=true;
            
            //check with previous characters
            for(int j=0;j<i;j++){
                if(current==text.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            
            if(isUnique){
                temp[uniqueCount]=current;
                uniqueCount++;
            }
        }
        
        //create array of exact size
        char result[]=new char[uniqueCount];
        for(int i=0;i<uniqueCount;i++){
            result[i]=temp[i];
        }
        return result;
    }
    
    //method to find frequency using unique characters
    public static String[][] findFrequency(String text){
        int freq[]=new int[256]; //ASCII frequency array
        
        //count frequency of each character
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //get unique characters
        char uniqueChars[]=findUniqueCharacters(text);
        
        //store character and frequency
        String result[][]=new String[uniqueChars.length][2];
        for(int i=0;i<uniqueChars.length;i++){
            result[i][0]=String.valueOf(uniqueChars[i]);
            result[i][1]=String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //method call
        String result[][]=findFrequency(text);
        
        //display result
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
    }
}
