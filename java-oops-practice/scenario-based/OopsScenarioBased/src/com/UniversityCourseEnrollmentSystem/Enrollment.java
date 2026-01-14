package com.UniversityCourseEnrollmentSystem;

//Enrollment class
class Enrollment{
  Student student;
  Course course;
  Faculty faculty;

  public Enrollment(Student student,Course course,Faculty faculty){
      this.student=student;
      this.course=course;
      this.faculty=faculty;
  }

  public void processResult(){
      student.calculateGpa(faculty.getGrades());
      System.out.println("Student: "+student.name);
      System.out.println("Course: "+course.getCourseName());
      System.out.println("GPA: "+student.getTranscript());
  }
}

