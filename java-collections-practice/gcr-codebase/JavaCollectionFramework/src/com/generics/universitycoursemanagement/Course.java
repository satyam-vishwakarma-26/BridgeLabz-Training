package com.generics.universitycoursemanagement;
// Generic course class with bounded type parameter
public class Course<T extends CourseType>{
    private String courseCode;
    private String courseName;
    private T courseType;
    public Course(String courseCode,String courseName,T courseType){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.courseType=courseType;
    }
    public void displayCourse(){
        System.out.println(courseCode+" | "+courseName+" | Evaluation: "+courseType.getEvaluationMethod());
        courseType.evaluate();
    }
}
