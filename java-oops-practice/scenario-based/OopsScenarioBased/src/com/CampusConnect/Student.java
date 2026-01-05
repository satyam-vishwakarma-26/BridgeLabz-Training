package com.CampusConnect;

import java.util.ArrayList;

/* ---------- Student Class ---------- */
class Student extends Person implements ICourseActions{
    private ArrayList<Course> courses=new ArrayList<>();
    private ArrayList<Integer> grades=new ArrayList<>(); //private grades

    public Student(int id,String name,String email){
        super(id,name,email);
    }

    public void enrollCourse(Course course){
        courses.add(course);
        course.addStudent(this);
        System.out.println(name+" enrolled in "+course.getCourseName());
    }

    public void dropCourse(Course course){
        courses.remove(course);
        course.removeStudent(this);
        System.out.println(name+" dropped "+course.getCourseName());
    }

    //add grade
    public void addGrade(int grade){
        grades.add(grade);
    }

    //calculate GPA
    public double calculateGPA(){
        if(grades.isEmpty()) return 0;
        int sum=0;
        for(int g:grades){
            sum+=g;
        }
        return (double)sum/grades.size();
    }

    //overridden method
    public void printDetails(){
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: "+calculateGPA());
    }
}