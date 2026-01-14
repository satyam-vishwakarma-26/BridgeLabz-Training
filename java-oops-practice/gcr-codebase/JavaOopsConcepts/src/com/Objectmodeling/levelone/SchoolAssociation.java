package com.Objectmodeling.levelone;

public class SchoolAssociation{
    public static void main(String [] args){

    	//Creating the object of the classes 
        School school=new School("Delhi Public School");

        Student s1=new Student("Rohan");
        Student s2=new Student("Neha");

        Course math=new Course("Mathematics");
        Course science=new Course("Science");
        
        //Calling the method with the object 
        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(math);
        s1.enrollCourse(science);

        s2.enrollCourse(science);

        //View courses of students
        s1.showCourses();
        System.out.println();
        s2.showCourses();

        System.out.println();

        //View students in course
        math.showStudents();
        System.out.println();
        science.showStudents();
    }
}
