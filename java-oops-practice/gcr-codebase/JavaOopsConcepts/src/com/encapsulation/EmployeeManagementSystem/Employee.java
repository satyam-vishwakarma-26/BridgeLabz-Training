package com.encapsulation.EmployeeManagementSystem;



//Abstract Employee class
abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    //constructor
    public Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    //getters and setters (encapsulation)
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }

    //department methods
    public void assignDepartment(String deptName){
        this.department=deptName;
    }
    public String getDepartmentDetails(){
        return department;
    }

    //abstract method
    public abstract double calculateSalary();

    //concrete method
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Final Salary: "+calculateSalary());
        System.out.println("---------------------------");
    }
}






