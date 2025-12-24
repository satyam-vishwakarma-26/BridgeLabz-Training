import java.util.Scanner;
public class LongestWord{
    public static void main(String[] args){
        //creating scanner class and object   	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence=sc.nextLine();
		
		//split string 
        String[] words=sentence.split(" ");
        String longest="";
		
        //find longest word
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        System.out.println("Longest word: "+longest);
    }
}
