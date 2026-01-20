package com.javastreams.bytearraystreams;
import java.io.*;
import java.util.Scanner;
// Program to convert image to byte array and back to image
public class ImageByteArrayApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            System.out.print("Enter source image path: ");
            String src=sc.nextLine().replace("\"","");
            System.out.print("Enter destination image path: ");
            String dest=sc.nextLine().replace("\"","");
            File sourceFile=new File(src);
            if(!sourceFile.exists()){
                System.out.println("Source image does not exist");
                return;
            }
            // Read image into byte array
            fis=new FileInputStream(sourceFile);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                baos.write(buffer,0,bytesRead);
            }
            byte[] imageBytes=baos.toByteArray();
            // Write byte array back to image file
            ByteArrayInputStream bais=new ByteArrayInputStream(imageBytes);
            fos=new FileOutputStream(dest);
            while((bytesRead=bais.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
            // Verify image integrity by size comparison
            File newFile=new File(dest);
            if(sourceFile.length()==newFile.length()){
                System.out.println("Image copied successfully and verified");
            }else{
                System.out.println("Image copied but verification failed");
            }
        }catch(IOException e){
            System.out.println("Error occurred: "+e.getMessage());
        }finally{
            try{
                if(fis!=null)fis.close();
                if(fos!=null)fos.close();
            }catch(IOException e){
                System.out.println("Error closing streams");
            }
        }
        sc.close();
    }
}
