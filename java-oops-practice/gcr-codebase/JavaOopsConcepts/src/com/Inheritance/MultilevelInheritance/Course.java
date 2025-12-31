package com.Inheritance.MultilevelInheritance;

//Base class
class Course{
  String courseName;
  int duration;

  Course(String courseName,int duration){
      this.courseName=courseName;
      this.duration=duration;
  }

  void displayInfo(){
      System.out.println("Course: "+courseName);
      System.out.println("Duration: "+duration+" hours");
  }
}

