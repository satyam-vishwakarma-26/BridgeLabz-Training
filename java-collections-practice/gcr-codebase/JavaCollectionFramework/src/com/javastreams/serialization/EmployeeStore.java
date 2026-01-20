package com.javastreams.serialization;
import java.io.*;
import java.util.*;
// Handles serialization and deserialization
public class EmployeeStore{
    // Serialize employee list to file
    public static void saveEmployees(List<Employee> list,String filePath){
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(list);
            oos.close();
            System.out.println("Employees saved successfully");
        }catch(IOException e){
            System.out.println("Error saving employees: "+e.getMessage());
        }
    }
    // Deserialize employee list from file
    public static List<Employee> loadEmployees(String filePath){
        List<Employee> list=null;
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
            list=(List<Employee>)ois.readObject();
            ois.close();
        }catch(IOException e){
            System.out.println("Error reading employees: "+e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Class not found: "+e.getMessage());
        }
        return list;
    }
}
