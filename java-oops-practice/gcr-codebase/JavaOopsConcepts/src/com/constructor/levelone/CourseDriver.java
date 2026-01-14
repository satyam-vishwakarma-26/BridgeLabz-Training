package com.constructor.levelone;

public class CourseDriver {

    public static void main(String[] args) {

        // create courses
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Science", 8, 60000);

        // display details
        c1.displayCourseDetails();
        System.out.println("-----");
        c2.displayCourseDetails();

        System.out.println("-----");

        // update institute name
        Course.updateInstituteName("BridgeLabz");

        // display again
        c1.displayCourseDetails();
        System.out.println("-----");
        c2.displayCourseDetails();
    }
}

