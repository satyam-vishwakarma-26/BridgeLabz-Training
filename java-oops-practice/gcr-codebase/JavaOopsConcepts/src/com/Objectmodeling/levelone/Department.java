package com.Objectmodeling.levelone;

import java.util.ArrayList;

class Department{
    String deptName;
    ArrayList<Employee> employees=new ArrayList<>();

    public Department(String deptName){
        this.deptName=deptName;
    }

    //add employee
    public void addEmployee(String name,int empId){
        Employee emp=new Employee(name,empId);
        employees.add(emp);
    }

    public void showDepartment(){
        System.out.println(" Department: "+deptName);
        for(Employee e:employees){
            e.showEmployee();
        }
    }
}

