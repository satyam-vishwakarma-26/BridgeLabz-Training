package com.generics.universitycoursemanagement;
// Research based course
public class ResearchCourse extends CourseType{
    public ResearchCourse(){
        super("Research Work");
    }
    public void evaluate(){
        System.out.println("Evaluation through research submission");
    }
}
