import java.util.Scanner;
public class SplitTextComparison{

    //method to find length of string without using length()
    public static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(Exception e){
        }
        return count;
    }
    
    //method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text){
        int len=findLength(text);
        
        //count words
        int wordCount=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                wordCount++;
            }
        }
        
        //store space indexes
        int spaceIndex[]=new int[wordCount-1];
        int index=0;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                spaceIndex[index]=i;
                index++;
            }
        }
        
        //extract words
        String words[]=new String[wordCount];
        int start=0;
        for(int i=0;i<spaceIndex.length;i++){
            words[i]="";
            for(int j=start;j<spaceIndex[i];j++){
                words[i]=words[i]+text.charAt(j);
            }
            start=spaceIndex[i]+1;
        }
        
        //last word
        words[wordCount-1]="";
        for(int i=start;i<len;i++){
            words[wordCount-1]=words[wordCount-1]+text.charAt(i);
        }
        
        return words;
    }
    
    //method to compare two string arrays
    public static boolean compareStringArrays(String a[],String b[]){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking complete text input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
       
        String userWords[]=splitUsingCharAt(text);
     
        String builtInWords[]=text.split(" ");
        
        //compare results
        boolean result=compareStringArrays(userWords,builtInWords);
        
        //display words
        System.out.print("Words using user-defined method: ");
        for(int i=0;i<userWords.length;i++){
            System.out.print(userWords[i]+" ");
        }
        System.out.println();
        
        System.out.print("Words using split(): ");
        for(int i=0;i<builtInWords.length;i++){
            System.out.print(builtInWords[i]+" ");
        }
        System.out.println();
        
        if(result){
            System.out.println("Both results are equal");
        }else{
            System.out.println("Both results are not equal");
        }
    }
}
