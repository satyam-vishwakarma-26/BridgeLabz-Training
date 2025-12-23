import java.util.Scanner;
public class CharacterFrequencyNestedLoop{

    //method to find frequency using nested loops
    public static String[] findCharacterFrequency(String text){
        char chars[]=text.toCharArray();
        int freq[]=new int[chars.length];
        
        //initialize frequency
        for(int i=0;i<chars.length;i++){
            freq[i]=1;
        }
        
        //nested loop to count frequency
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='0'){
                continue;
            }
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    freq[i]++;
                    chars[j]='0'; 
                }
            }
        }
        
        //count unique characters
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                count++;
            }
        }
        
        //store character and frequency in 1D String array
        String result[]=new String[count];
        int index=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                result[index]=chars[i]+" : "+freq[i];
                index++;
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
        
        //method call
        String result[]=findCharacterFrequency(text);
        
        //display result
        System.out.println("Character Frequency:");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
