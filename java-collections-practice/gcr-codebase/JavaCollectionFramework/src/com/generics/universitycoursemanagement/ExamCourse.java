package com.generics.universitycoursemanagement;
// Exam based course
public class ExamCourse extends CourseType{
    public ExamCourse(){
        super("Written Examination");
    }
    public void evaluate(){
        System.out.println("Evaluation through final written exam");
    }
}
