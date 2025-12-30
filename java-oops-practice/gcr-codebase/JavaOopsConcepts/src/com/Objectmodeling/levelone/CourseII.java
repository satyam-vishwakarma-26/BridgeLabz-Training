package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Course class
class CourseII{
  String courseName;
  Professor professor;
  ArrayList<Student> students=new ArrayList<>();

  public CourseII(String courseName){
      this.courseName=courseName;
  }

  //assign professor to course
  public void assignProfessor(Professor professor){
      this.professor=professor;
      professor.addCourse(this);
      System.out.println(professor.name+" assigned to "+courseName);
  }

  //add student to course
  public void addStudent(Student student){
      students.add(student);
  }

  //show course details
  public void showCourseDetails(){
      System.out.println("\nCourse: "+courseName);
      if(professor!=null){
          System.out.println("Professor: "+professor.name);
      }
      System.out.println("Enrolled Students:");
      for(Student s:students){
          System.out.println("- "+s.name);
      }
  }
}

