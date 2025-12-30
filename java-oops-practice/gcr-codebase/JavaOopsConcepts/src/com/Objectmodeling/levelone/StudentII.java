package com.Objectmodeling.levelone;

import java.util.ArrayList;

class Student{
    String name;
    ArrayList<Course> courses=new ArrayList<>();

    public Student(String name){
        this.name=name;
    }

    //enroll in course
    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
        System.out.println(name+" enrolled in "+course.courseName);
    }

    //view enrolled courses
    public void viewCourses(){
        System.out.println("\nCourses enrolled by "+name+":");
        for(Course c:courses){
            System.out.println("- "+c.courseName);
        }
    }
}

