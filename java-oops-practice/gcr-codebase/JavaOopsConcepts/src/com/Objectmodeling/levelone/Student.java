package com.Objectmodeling.levelone;

import java.util.ArrayList;


class Student{
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name){
        this.name=name;
    }
    //Student enroll in course 
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }
    //showing course details 
    public void showCourses(){
        System.out.println("Student: "+name);
        for(Course c:courses){
            System.out.println("Enrolled in: "+c.courseName);
        }
    }
}
