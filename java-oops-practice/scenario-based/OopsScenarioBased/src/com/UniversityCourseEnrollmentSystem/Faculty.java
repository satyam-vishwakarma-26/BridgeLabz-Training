package com.UniversityCourseEnrollmentSystem;
import java.util.*;
//Faculty class
class Faculty implements Graded{
  String facultyName;
  List<String> grades=new ArrayList<>();

  public Faculty(String facultyName){
      this.facultyName=facultyName;
  }

  public void assignGrade(String grade){
      grades.add(grade);
  }

  public List<String> getGrades(){
      return grades;
  }
}
