package com.IOReader.FileReader;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordOccurrence{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String target=sc.nextLine();

        FileReader fr=null;
        BufferedReader br=null;
        int count=0;

        try{
            //create FileReader
            fr=new FileReader("sample.txt");

            //wrap with BufferedReader
            br=new BufferedReader(fr);

            String line;

            //read file line by line
            while((line=br.readLine())!=null){
                //split line into words
                String[] words=line.split("\\s+");

                for(int i=0;i<words.length;i++){
                    if(words[i].equalsIgnoreCase(target)){
                        count++;
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }
            }
            catch(IOException e){
                System.out.println("Error closing file");
            }
        }

        System.out.println("The word \""+target+"\" occurred "+count+" times.");
    }
}
