package com.javastreams.bufferedstreams;
import java.io.*;
// Program to read user input from console and save to file
public class UserInfoToFile{
    public static void main(String[] args){
        BufferedReader br=null;
        FileWriter fw=null;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name=br.readLine();
            System.out.print("Enter your age: ");
            String age=br.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language=br.readLine();
            System.out.print("Enter file path to save data: ");
            String filePath=br.readLine();
            fw=new FileWriter(filePath);
            fw.write("Name: "+name+"\n");
            fw.write("Age: "+age+"\n");
            fw.write("Favorite Language: "+language+"\n");
            System.out.println("User information saved successfully");
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }finally{
            try{
                if(fw!=null)fw.close();
                if(br!=null)br.close();
            }catch(IOException e){
                System.out.println("Error closing resources");
            }
        }
    }
}
