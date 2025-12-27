package com.constructor.levelone;

public class Course {

    // instance variables
    public String courseName;
    public int duration;      // in months
    public double fee;

    // class variable (shared)
    public static String instituteName = "Tech Institute";

    // constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    // class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

