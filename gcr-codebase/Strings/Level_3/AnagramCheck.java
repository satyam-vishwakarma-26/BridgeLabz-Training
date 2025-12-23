import java.util.Scanner;
public class AnagramCheck{

    //method to check if two texts are anagrams
    public static boolean isAnagram(String text1,String text2){
        
        //check length
        if(text1.length()!=text2.length()){
            return false;
        }
        
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        
        //find frequency of characters in first text
        for(int i=0;i<text1.length();i++){
            freq1[text1.charAt(i)]++;
        }
        
        //find frequency of characters in second text
        for(int i=0;i<text2.length();i++){
            freq2[text2.charAt(i)]++;
        }
        
        //compare frequencies
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter first text: ");
        String text1=sc.nextLine();
        
        System.out.print("Enter second text: ");
        String text2=sc.nextLine();
        
        //method calling 
        boolean result=isAnagram(text1,text2);
        
        //display result
        if(result){
            System.out.println("The given texts are Anagrams");
        }else{
            System.out.println("The given texts are Not Anagrams");
        }
    }
}
