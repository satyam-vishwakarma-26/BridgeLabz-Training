package com.challengeproblem;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareIOAndStrings{

    //compare StringBuilder and StringBuffer
    public static void compareStringConcatenation(){
        int n=1_000_000;

        //StringBuilder
        StringBuilder sbuilder=new StringBuilder();
        long startBuilder=System.nanoTime();
        for(int i=0;i<n;i++){
            sbuilder.append("hello");
        }
        long endBuilder=System.nanoTime();
        long builderTime=endBuilder-startBuilder;

        //StringBuffer
        StringBuffer sbuffer=new StringBuffer();
        long startBuffer=System.nanoTime();
        for(int i=0;i<n;i++){
            sbuffer.append("hello");
        }
        long endBuffer=System.nanoTime();
        long bufferTime=endBuffer-startBuffer;

        System.out.println("\n--- String Concatenation Comparison ---");
        System.out.println("StringBuilder Time : "+builderTime+" ns");
        System.out.println("StringBuffer Time  : "+bufferTime+" ns");
    }

    //count words using FileReader
    public static void countWordsUsingFileReader(String filePath){
        long start=System.nanoTime();
        int wordCount=0;

        try(FileReader fr=new FileReader(filePath);
            BufferedReader br=new BufferedReader(fr)){

            String line;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                wordCount+=words.length;
            }
        }catch(IOException e){
            System.out.println("FileReader Error: "+e.getMessage());
        }

        long end=System.nanoTime();

        System.out.println("\n--- FileReader Result ---");
        System.out.println("Word Count: "+wordCount);
        System.out.println("Time Taken: "+(end-start)+" ns");
    }

    //count words using InputStreamReader
    public static void countWordsUsingInputStreamReader(String filePath){
        long start=System.nanoTime();
        int wordCount=0;

        try(FileInputStream fis=new FileInputStream(filePath);
            InputStreamReader isr=new InputStreamReader(fis,StandardCharsets.UTF_8);
            BufferedReader br=new BufferedReader(isr)){

            String line;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                wordCount+=words.length;
            }
        }catch(IOException e){
            System.out.println("InputStreamReader Error: "+e.getMessage());
        }

        long end=System.nanoTime();

        System.out.println("\n--- InputStreamReader Result ---");
        System.out.println("Word Count: "+wordCount);
        System.out.println("Time Taken: "+(end-start)+" ns");
    }

    //main method
    public static void main(String[] args){

        String filePath="largefile.txt"; //100MB text file

        compareStringConcatenation();

        countWordsUsingFileReader(filePath);

        countWordsUsingInputStreamReader(filePath);
    }
}
