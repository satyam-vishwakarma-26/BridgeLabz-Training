package com.IOReader.FileReader;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine{

    public static void main(String[] args){

        FileReader fr=null;
        BufferedReader br=null;

        try{
            //create FileReader
            fr=new FileReader("sample.txt");

            //wrap with BufferedReader
            br=new BufferedReader(fr);

            String line;

            //read file line by line
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        finally{
            try{
                //close resources
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
    }
}
