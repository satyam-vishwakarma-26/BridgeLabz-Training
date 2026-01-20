package com.javastreams.filterstreams;
import java.io.*;
import java.util.Scanner;
// Program to convert uppercase text to lowercase while copying file
public class UpperToLowerFileCopy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            System.out.print("Enter source file path: ");
            String src=sc.nextLine().replace("\"","");
            System.out.print("Enter destination file path: ");
            String dest=sc.nextLine().replace("\"","");
            File sourceFile=new File(src);
            if(!sourceFile.exists()){
                System.out.println("Source file does not exist");
                return;
            }
            br=new BufferedReader(new FileReader(sourceFile));
            bw=new BufferedWriter(new FileWriter(dest));
            int ch;
            while((ch=br.read())!=-1){
                bw.write(Character.toLowerCase((char)ch));
            }
            System.out.println("File copied with uppercase converted to lowercase");
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }finally{
            try{
                if(br!=null)br.close();
                if(bw!=null)bw.close();
            }catch(IOException e){
                System.out.println("Error closing streams");
            }
        }
        sc.close();
    }
}
