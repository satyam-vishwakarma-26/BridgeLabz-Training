package com.javastreams.bufferedstreams;
import java.io.*;
import java.util.Scanner;

// Program to compare buffered and unbuffered file copy performance
public class BufferedVsUnbufferedCopy{

	// Copy file using unbuffered streams
    private static long copyUnbuffered(String src,String dest)throws IOException{
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest);
        byte[] buffer=new byte[4096];
        int bytesRead;
        long start=System.nanoTime();
        while((bytesRead=fis.read(buffer))!=-1){
            fos.write(buffer,0,bytesRead);
        }
        long end=System.nanoTime();
        fis.close();
        fos.close();
        return end-start;
    }
    
    // Copy file using buffered streams
    private static long copyBuffered(String src,String dest)throws IOException{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buffer=new byte[4096];
        int bytesRead;
        long start=System.nanoTime();
        while((bytesRead=bis.read(buffer))!=-1){
            bos.write(buffer,0,bytesRead);
        }
        bos.flush();
        long end=System.nanoTime();
        bis.close();
        bos.close();
        return end-start;
    }
    
    // Main method with user input
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter source file path: ");
            String source=sc.nextLine();
            System.out.print("Enter destination path (unbuffered): ");
            String dest1=sc.nextLine();
            System.out.print("Enter destination path (buffered): ");
            String dest2=sc.nextLine();
            long unbufferedTime=copyUnbuffered(source,dest1);
            long bufferedTime=copyBuffered(source,dest2);
            System.out.println("Unbuffered Copy Time (ns): "+unbufferedTime);
            System.out.println("Buffered Copy Time (ns): "+bufferedTime);
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }
        sc.close();
    }
}
