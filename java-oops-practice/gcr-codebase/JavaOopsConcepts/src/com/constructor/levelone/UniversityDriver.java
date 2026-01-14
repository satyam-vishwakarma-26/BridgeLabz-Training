package com.constructor.levelone;

public class UniversityDriver {

    public static void main(String[] args) {

        PostgraduateStudent pg =
                new PostgraduateStudent(101, "Satyam", 8.6, "Computer Science");

        pg.displayPGStudent();

        System.out.println("-----");

        // modify CGPA using public method
        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

