package com.CampusConnect;
/* ---------- Main Class ---------- */
public class CampusConnect{
    public static void main(String[] args){

        //faculty
        Faculty f1=new Faculty(101,"Dr. Sharma","sharma@uni.edu","Computer Science");

        //students
        Student s1=new Student(201,"Rohan","rohan@uni.edu");
        Student s2=new Student(202,"Neha","neha@uni.edu");

        //course
        Course c1=new Course("CS101","Java Programming",f1);

        //enroll students
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        //assign grades
        f1.assignGrade(s1,8);
        f1.assignGrade(s1,9);
        f1.assignGrade(s2,7);

        //polymorphism
        System.out.println("\n--- Person Details ---");
        Person p1=s1;
        Person p2=f1;
        p1.printDetails();
        System.out.println();
        p2.printDetails();

        //course details
        c1.showCourseDetails();
    }
}