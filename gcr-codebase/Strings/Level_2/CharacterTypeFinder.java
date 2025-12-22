import java.util.Scanner;
public class CharacterTypeFinder{

    //method to check character type
    public static String checkCharacterType(char ch){
        //convert uppercase to lowercase using ASCII
        if(ch>='A'&&ch<='Z'){
            ch=(char)(ch+32);
        }
        
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    //method to find character and its type using charAt()
    public static String[][] findCharacterTypes(String text){
        String result[][]=new String[text.length()][2];
        
        for(int i=0;i<text.length();i++){
            result[i][0]=String.valueOf(text.charAt(i));
            result[i][1]=checkCharacterType(text.charAt(i));
        }
        return result;
    }
    
    //method to display 2D array in tabular format
    public static void displayResult(String data[][]){
        System.out.println("Character\tType");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t\t"+data[i][1]);
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        //Taking user input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //method calling
        String result[][]=findCharacterTypes(text);
        
        displayResult(result);
    }
}
