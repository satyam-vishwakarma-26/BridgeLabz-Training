import java.util.Scanner;
public class ShortestLongestWord{

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
        int idx=0;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                spaceIndex[idx]=i;
                idx++;
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
    
    //method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String words[]){
        String table[][]=new String[words.length][2];
        
        for(int i=0;i<words.length;i++){
            table[i][0]=words[i];
            table[i][1]=String.valueOf(findLength(words[i]));
        }
        return table;
    }
    
    //method to find shortest and longest word index
    public static int[] findShortestAndLongest(String table[][]){
        int minIndex=0;
        int maxIndex=0;
        
        int minLen=Integer.parseInt(table[0][1]);
        int maxLen=Integer.parseInt(table[0][1]);
        
        for(int i=1;i<table.length;i++){
            int len=Integer.parseInt(table[i][1]);
            
            if(len<minLen){
                minLen=len;
                minIndex=i;
            }
            if(len>maxLen){
                maxLen=len;
                maxIndex=i;
            }
        }
        return new int[]{minIndex,maxIndex};
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking complete text input
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        
        //splitting text into words
        String words[]=splitUsingCharAt(text);
        
        //creating 2D array of word and length
        String table[][]=createWordLengthTable(words);
        
        //finding shortest and longest word
        int index[]=findShortestAndLongest(table);
        
        //display result
        System.out.println("Words with Length:");
        System.out.println("Word\tLength");
        for(int i=0;i<table.length;i++){
            System.out.println(table[i][0]+"\t"+Integer.parseInt(table[i][1]));
        }
        
        System.out.println("\nShortest Word: "+table[index[0]][0]);
        System.out.println("Longest Word: "+table[index[1]][0]);
    }
}
