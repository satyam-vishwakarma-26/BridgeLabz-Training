package com.javastreams.serialization;
import java.util.*;

// Test class for Employee Serialization system
public class SerializationApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> employees=new ArrayList<>();
        int choice;

        // Menu driven serialization system
        do{
            System.out.println("\n1.Add Employee\n2.Save Employees\n3.Load & Display Employees\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept=sc.nextLine();
                    System.out.print("Enter salary: ");
                    double sal=sc.nextDouble();
                    employees.add(new Employee(id,name,dept,sal));
                    System.out.println("Employee added");
                    break;
                case 2:
                    System.out.print("Enter file path to save: ");
                    String savePath=sc.nextLine();
                    EmployeeStore.saveEmployees(employees,savePath);
                    break;
                case 3:
                    System.out.print("Enter file path to load: ");
                    String loadPath=sc.nextLine();
                    List<Employee> loaded=EmployeeStore.loadEmployees(loadPath);
                    if(loaded!=null){
                        for(Employee e:loaded){
                            e.display();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Serialization system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
