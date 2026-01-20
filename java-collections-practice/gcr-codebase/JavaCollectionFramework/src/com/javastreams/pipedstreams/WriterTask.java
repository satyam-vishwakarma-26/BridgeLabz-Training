package com.javastreams.pipedstreams;
import java.io.*;
// Writer thread writes data to PipedOutputStream
public class WriterTask implements Runnable{
    private PipedOutputStream pos;
    public WriterTask(PipedOutputStream pos){
        this.pos=pos;
    }
    public void run(){
        try{
            String message="Hello from Writer Thread";
            pos.write(message.getBytes());
            pos.close();
        }catch(IOException e){
            System.out.println("Writer error: "+e.getMessage());
        }
    }
}
