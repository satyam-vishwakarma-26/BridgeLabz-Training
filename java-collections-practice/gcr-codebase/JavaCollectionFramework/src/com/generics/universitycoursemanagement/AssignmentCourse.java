package com.generics.universitycoursemanagement;
// Assignment based course
public class AssignmentCourse extends CourseType{
    public AssignmentCourse(){
        super("Assignments");
    }
    public void evaluate(){
        System.out.println("Evaluation through assignments");
    }
}
