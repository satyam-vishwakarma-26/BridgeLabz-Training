package com.IOReader.InputStreamReader;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile{

    public static void main(String[] args){

        InputStreamReader isr=null;
        BufferedReader br=null;
        FileWriter fw=null;

        try{
            //read from console
            isr=new InputStreamReader(System.in);
            br=new BufferedReader(isr);

            //write to file
            fw=new FileWriter("output.txt",true);

            System.out.println("Enter text (type 'exit' to stop):");

            String line;

            while(true){
                line=br.readLine();

                if(line.equalsIgnoreCase("exit")){
                    break;
                }

                fw.write(line);
                fw.write(System.lineSeparator());
            }

            System.out.println("Data written to file successfully.");

        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            try{
                if(fw!=null) fw.close();
                if(br!=null) br.close();
                if(isr!=null) isr.close();
            }
            catch(IOException e){
                System.out.println("Error closing resources");
            }
        }
    }
}
