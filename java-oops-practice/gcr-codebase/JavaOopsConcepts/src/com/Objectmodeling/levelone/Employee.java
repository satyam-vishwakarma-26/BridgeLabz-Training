package com.Objectmodeling.levelone;

//Employee class (depends on Department)
class Employee{
  String name;
  int empId;

  public Employee(String name,int empId){
      this.name=name;
      this.empId=empId;
  }

  public void showEmployee(){
      System.out.println("   Employee ID: "+empId+", Name: "+name);
  }
}

