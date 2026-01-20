package com.javastreams.datastreams;
// Represents student data
public class Student{
    int rollNo;
    String name;
    double gpa;
    public Student(int rollNo,String name,double gpa){
        this.rollNo=rollNo;
        this.name=name;
        this.gpa=gpa;
    }
    // Display student details
    public void display(){
        System.out.println("Roll:"+rollNo+" Name:"+name+" GPA:"+gpa);
    }
}
