package com.generics.universitycoursemanagement;
import java.util.*;
// Manages all university courses using wildcards
public class UniversityCatalog{
    private List<Course<? extends CourseType>> courses=new ArrayList<>();
    // Add any type of course safely
    public void addCourse(Course<? extends CourseType> course){
        courses.add(course);
        System.out.println("Course added");
    }
    // Display all courses
    public void displayAllCourses(){
        for(Course<? extends CourseType> c:courses){
            c.displayCourse();
        }
    }
}
