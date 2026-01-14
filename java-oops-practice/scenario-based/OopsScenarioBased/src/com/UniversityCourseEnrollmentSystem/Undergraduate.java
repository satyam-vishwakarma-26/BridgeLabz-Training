package com.UniversityCourseEnrollmentSystem;
import java.util.*;
//Undergraduate student
class Undergraduate extends Student{
  public Undergraduate(int id,String name){
      super(id,name);
  }

  //letter grading
  public void calculateGpa(List<String> grades){
      double total=0;
      for(String g:grades){
          switch(g){
              case "A": total+=4; break;
              case "B": total+=3; break;
              case "C": total+=2; break;
              case "D": total+=1; break;
              default: total+=0;
          }
      }
      setGpa(total/grades.size());
  }
}
