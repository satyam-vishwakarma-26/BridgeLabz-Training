package com.UniversityCourseEnrollmentSystem;

//Course class
class Course{
  private String courseCode;
  private String courseName;

  public Course(String courseCode,String courseName){
      this.courseCode=courseCode;
      this.courseName=courseName;
  }

  public String getCourseName(){
      return courseName;
  }
}
