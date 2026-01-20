package com.javastreams.LargeFileErrorReader;
import java.io.*;
import java.util.Scanner;
// Program to read large file line by line and print lines containing 'error'
public class LargeFileErrorReader{
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
            String line;
            // Read file line by line
            while((line=br.readLine())!=null){
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
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
