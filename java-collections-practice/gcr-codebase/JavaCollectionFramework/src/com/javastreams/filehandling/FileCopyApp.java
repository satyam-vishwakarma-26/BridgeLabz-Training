package com.javastreams.filehandling;
import java.io.*;
import java.util.Scanner;
// Program to read from one file and write to another
public class FileCopyApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter source file path: ");
        String sourcePath=sc.nextLine();
        System.out.print("Enter destination file path: ");
        String destPath=sc.nextLine();
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            File sourceFile=new File(sourcePath);
            if(!sourceFile.exists()){
                System.out.println("Source file does not exist");
                return;
            }
            fis=new FileInputStream(sourceFile);
            fos=new FileOutputStream(destPath);
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("File copied successfully");
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }finally{
            try{
                if(fis!=null)fis.close();
                if(fos!=null)fos.close();
            }catch(IOException e){
                System.out.println("Error closing file");
            }
        }
        sc.close();
    }
}
