import java.util.Scanner;
public class CharacterFrequency{

    //method to find character frequency
    public static String[][] findCharacterFrequency(String text){
        int freq[]=new int[256]; 
        
        //count frequency of each character
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //count unique characters
        int count=0;
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]>0){
                count++;
                freq[text.charAt(i)]=-freq[text.charAt(i)];
            }
        }
        
        //reset and recount for storing
        freq=new int[256];
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }
        
        //store characters and frequencies
        String result[][]=new String[count][2];
        int index=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(freq[ch]>0){
                result[index][0]=String.valueOf(ch);
                result[index][1]=String.valueOf(freq[ch]);
                index++;
                freq[ch]=0; //avoid duplicates
            }
        }
        return result;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //method calling 
        String result[][]=findCharacterFrequency(text);
        
        //display result
        System.out.println("Character\tFrequency");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
    }
}
