package com.Inheritance.HierarchicalInheritance;


//Staff subclass
class Staff extends Person{
String department;

Staff(String name,int age,String department){
    super(name,age);
    this.department=department;
}

void displayRole(){
    System.out.println("Role: Staff");
    displayDetails();
    System.out.println("Department: "+department);
}
}
