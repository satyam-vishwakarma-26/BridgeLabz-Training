package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Course class
class Course{
  String courseName;
  ArrayList<Student> students = new ArrayList<>();

  public Course(String courseName){
      this.courseName=courseName;
  }
  //Method for add students 
  public void addStudent(Student student){
      students.add(student);
  }

  //show students 
  public void showStudents(){
      System.out.println("Course: "+courseName);
      for(Student s:students){
          System.out.println("Student: "+s.name);
      }
  }
}
