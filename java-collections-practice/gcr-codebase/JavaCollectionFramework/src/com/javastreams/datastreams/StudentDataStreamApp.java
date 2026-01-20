package com.javastreams.datastreams;
import java.io.*;
import java.util.Scanner;
// Program to store and retrieve student data using data streams
public class StudentDataStreamApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        // Menu driven data stream system
        do{
            System.out.println("\n1.Save Student\n2.Load Student\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    saveStudent(sc);
                    break;
                case 2:
                    loadStudent(sc);
                    break;
                case 0:
                    System.out.println("Data stream system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
    // Write primitive data to file
    private static void saveStudent(Scanner sc){
        DataOutputStream dos=null;
        try{
            System.out.print("Enter roll number: ");
            int roll=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name=sc.nextLine();
            System.out.print("Enter GPA: ");
            double gpa=sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter file path to save: ");
            String path=sc.nextLine().replace("\"","");
            dos=new DataOutputStream(new FileOutputStream(path));
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data saved successfully");
        }catch(IOException e){
            System.out.println("Error saving data: "+e.getMessage());
        }finally{
            try{
                if(dos!=null)dos.close();
            }catch(IOException e){
                System.out.println("Error closing stream");
            }
        }
    }
    // Read primitive data from file
    private static void loadStudent(Scanner sc){
        DataInputStream dis=null;
        try{
            System.out.print("Enter file path to load: ");
            String path=sc.nextLine().replace("\"","");
            dis=new DataInputStream(new FileInputStream(path));
            int roll=dis.readInt();
            String name=dis.readUTF();
            double gpa=dis.readDouble();
            Student s=new Student(roll,name,gpa);
            s.display();
        }catch(IOException e){
            System.out.println("Error reading data: "+e.getMessage());
        }finally{
            try{
                if(dis!=null)dis.close();
            }catch(IOException e){
                System.out.println("Error closing stream");
            }
        }
    }
}
