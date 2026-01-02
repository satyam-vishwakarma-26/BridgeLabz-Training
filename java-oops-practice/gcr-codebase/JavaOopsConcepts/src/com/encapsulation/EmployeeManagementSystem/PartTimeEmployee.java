package com.encapsulation.EmployeeManagementSystem;

//Part-time employee
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id,String name,double baseSalary,int hoursWorked,double hourlyRate){
        super(id,name,baseSalary);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
