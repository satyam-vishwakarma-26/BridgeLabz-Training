package com.UniversityCourseEnrollmentSystem;
import java.util.*;
//Postgraduate student
class Postgraduate extends Student{
  public Postgraduate(int id,String name){
      super(id,name);
  }

  //pass/fail grading
  public void calculateGpa(List<String> grades){
      int passCount=0;
      for(String g:grades){
          if(g.equals("PASS")){
              passCount++;
          }
      }
      setGpa(passCount==grades.size()?4.0:2.0);
  }
}
