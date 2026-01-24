package com.exceptionhandling;
import java.io.*;

public class CheckedException {

	//main method 
    public static void main(String[] args) {

    	//try and catch block which can handle the runtime error 
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}