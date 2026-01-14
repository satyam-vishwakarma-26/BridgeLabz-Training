package com.Objectmodeling.levelone;

import java.util.ArrayList;


class School{
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    
    public School(String schoolName){
        this.schoolName=schoolName;
    }
    //adding students 
    public void addStudent(Student student){
        students.add(student);
    }
}
