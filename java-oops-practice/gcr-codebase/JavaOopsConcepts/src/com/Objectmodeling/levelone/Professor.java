package com.Objectmodeling.levelone;

import java.util.ArrayList;

class Professor{
    String name;
    ArrayList<Course> courses=new ArrayList<>();

    public Professor(String name){
        this.name=name;
    }

    //add course taught
    public void addCourse(Course course){
        courses.add(course);
    }

    //view courses taught
    public void viewCourses(){
        System.out.println("\nCourses taught by "+name+":");
        for(Course c:courses){
            System.out.println("- "+c.courseName);
        }
    }
}
