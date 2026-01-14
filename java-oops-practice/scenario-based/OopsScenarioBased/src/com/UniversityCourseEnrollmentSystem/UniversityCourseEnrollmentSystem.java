package com.UniversityCourseEnrollmentSystem;

import java.util.*;

//Main class
public class UniversityCourseEnrollmentSystem{
  public static void main(String[] args){

      Course c1=new Course("CS101","Java Programming");

      Student s1=new Undergraduate(1,"Rohan");
      Student s2=new Postgraduate(2,"Anita");

      Faculty f1=new Faculty("Dr. Sharma");

      //assign grades (polymorphism via interface)
      f1.assignGrade("A");
      f1.assignGrade("B");

      Enrollment e1=new Enrollment(s1,c1,f1);
      e1.processResult();

      System.out.println();

      Faculty f2=new Faculty("Dr. Mehta");
      f2.assignGrade("PASS");
      f2.assignGrade("PASS");

      Enrollment e2=new Enrollment(s2,c1,f2);
      e2.processResult();
  }
}
