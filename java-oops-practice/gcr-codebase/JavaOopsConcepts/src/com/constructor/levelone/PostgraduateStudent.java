package com.constructor.levelone;

public class PostgraduateStudent extends Student {

    public String specialization;

    // constructor
    public PostgraduateStudent(int rollNumber, String name,
                               double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // using protected member
    public void displayPGStudent() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("CGPA: " + getCGPA());         // private via getter
        System.out.println("Specialization: " + specialization);
    }
}
