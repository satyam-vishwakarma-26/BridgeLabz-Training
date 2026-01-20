package com.javastreams.pipedstreams;
import java.io.*;
// Reader thread reads data from PipedInputStream
public class ReaderTask implements Runnable{
    private PipedInputStream pis;
    public ReaderTask(PipedInputStream pis){
        this.pis=pis;
    }
    public void run(){
        try{
            int data;
            while((data=pis.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
            pis.close();
        }catch(IOException e){
            System.out.println("Reader error: "+e.getMessage());
        }
    }
}
