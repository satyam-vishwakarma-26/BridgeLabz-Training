package com.IOReader.InputStreamReader;


import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteToCharStream{

    public static void main(String[] args){

        FileInputStream fis=null;
        InputStreamReader isr=null;
        BufferedReader br=null;

        try{
            //byte stream
            fis=new FileInputStream("sample.txt");

            //convert byte stream to character stream (UTF-8)
            isr=new InputStreamReader(fis,StandardCharsets.UTF_8);

            //buffered reader for efficiency
            br=new BufferedReader(isr);

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
                if(br!=null) br.close();
                if(isr!=null) isr.close();
                if(fis!=null) fis.close();
            }
            catch(IOException e){
                System.out.println("Error closing resources");
            }
        }
    }
}
