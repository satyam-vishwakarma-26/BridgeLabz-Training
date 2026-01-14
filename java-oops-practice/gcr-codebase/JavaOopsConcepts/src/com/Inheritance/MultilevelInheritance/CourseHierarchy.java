package com.Inheritance.MultilevelInheritance;

public class CourseHierarchy{
    public static void main(String[] args){
        Course c1=new Course("Java Basics",40);
        Course c2=new OnlineCourse("OOP Concepts",30,"Coursera",true);
        Course c3=new PaidOnlineCourse("Advanced Java",50,"Udemy",true,4999,20);

        c1.displayInfo();
        System.out.println("-----");
        c2.displayInfo();
        System.out.println("-----");
        c3.displayInfo();
    }
}
