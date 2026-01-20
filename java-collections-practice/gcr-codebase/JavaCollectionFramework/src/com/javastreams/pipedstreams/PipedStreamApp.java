package com.javastreams.pipedstreams;
import java.io.*;
// Demonstrates inter-thread communication using piped streams
public class PipedStreamApp{
    public static void main(String[] args){
        try{
            // Create piped streams and connect them
            PipedOutputStream pos=new PipedOutputStream();
            PipedInputStream pis=new PipedInputStream(pos);
            // Create writer and reader threads
            Thread writer=new Thread(new WriterTask(pos));
            Thread reader=new Thread(new ReaderTask(pis));
            // Start threads
            writer.start();
            reader.start();
            // Wait for threads to finish
            writer.join();
            reader.join();
            System.out.println("Piped stream communication completed");
        }catch(IOException e){
            System.out.println("Stream connection error: "+e.getMessage());
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
    }
}
