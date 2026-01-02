package com.encapsulation.EmployeeManagementSystem;

import java.util.ArrayList;
//Main class
public class EmployeeManagementSystem{
  public static void main(String[] args){

      ArrayList<Employee> employees=new ArrayList<>();

      //create employees
      Employee e1=new FullTimeEmployee(101,"Rohan",30000,10000);
      e1.assignDepartment("IT");

      Employee e2=new PartTimeEmployee(102,"Amit",0,80,500);
      e2.assignDepartment("HR");

      Employee e3=new FullTimeEmployee(103,"Neha",35000,8000);
      e3.assignDepartment("Finance");

      //add to list
      employees.add(e1);
      employees.add(e2);
      employees.add(e3);

      //polymorphism in action
      for(Employee emp:employees){
          emp.displayDetails();
      }
  }
}

