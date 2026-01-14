package com.encapsulation.EmployeeManagementSystem;

//Full-time employee
class FullTimeEmployee extends Employee{
  private double fixedBonus;

  public FullTimeEmployee(int id,String name,double baseSalary,double fixedBonus){
      super(id,name,baseSalary);
      this.fixedBonus=fixedBonus;
  }

  public double calculateSalary(){
      return getBaseSalary()+fixedBonus;
  }
}
