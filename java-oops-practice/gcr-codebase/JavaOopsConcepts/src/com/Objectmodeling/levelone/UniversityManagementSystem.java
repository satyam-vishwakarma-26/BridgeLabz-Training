package com.Objectmodeling.levelone;

import java.util.ArrayList;

public class UniversityManagementSystem{
    public static void main(String[] args){

        //create students
        StudentII s1=new StudentII("Rohan");
        StudentII s2=new StudentII("Neha");

        //create professors
        Professor p1=new Professor("Dr. Sharma");
        Professor p2=new Professor("Dr. Mehta");

        //create courses
        CourseII c1=new CourseII("Data Structures");
        CourseII c2=new CourseII("Operating Systems");

        //assign professors
        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        //students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        //view details
        s1.viewCourses();
        s2.viewCourses();
        p1.viewCourses();
        p2.viewCourses();
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}