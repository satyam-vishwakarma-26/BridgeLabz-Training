package com.javastreams.countwords;
import java.io.*;
import java.util.*;
// Program to count words and display top 5 frequent words
public class WordFrequencyCounter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BufferedReader br=null;
        try{
            System.out.print("Enter file path: ");
            String filePath=sc.nextLine().replace("\"","");
            File file=new File(filePath);
            if(!file.exists()){
                System.out.println("File does not exist");
                return;
            }
            br=new BufferedReader(new FileReader(file));
            HashMap<String,Integer> map=new HashMap<>();
            String line;
            // Read file line by line
            while((line=br.readLine())!=null){
                line=line.toLowerCase();
                String[] words=line.split("\\W+");
                for(String word:words){
                    if(word.length()>0){
                        map.put(word,map.getOrDefault(word,0)+1);
                    }
                }
            }
            // Sort words by frequency
            List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((a,b)->b.getValue()-a.getValue());
            System.out.println("Top 5 most frequent words:");
            int count=0;
            for(Map.Entry<String,Integer> e:list){
                System.out.println(e.getKey()+" : "+e.getValue());
                count++;
                if(count==5)break;
            }
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }finally{
            try{
                if(br!=null)br.close();
            }catch(IOException e){
                System.out.println("Error closing file");
            }
        }
        sc.close();
    }
}
