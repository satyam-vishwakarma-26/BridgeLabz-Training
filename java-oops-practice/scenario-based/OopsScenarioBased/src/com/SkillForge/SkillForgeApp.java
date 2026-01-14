package com.SkillForge;
import java.util.Scanner;

public class SkillForgeApp{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("=== Welcome to SkillForge ===");

        //Instructor
        System.out.print("Instructor Name: ");
        String iname=sc.nextLine();
        System.out.print("Instructor Email: ");
        String iemail=sc.nextLine();
        Instructor instructor=new Instructor(iname,iemail);

        //Course
        System.out.print("\nCourse Title: ");
        String title=sc.nextLine();

        System.out.print("Course Level (Beginner/Intermediate/Advanced): ");
        String level=sc.nextLine();

        System.out.print("Number of modules: ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] modules=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter module "+(i+1)+": ");
            modules[i]=sc.nextLine();
        }

        Course course=new Course(title,iname,level,modules);
        instructor.uploadCourse(course);

        //Student
        System.out.print("\nStudent Name: ");
        String sname=sc.nextLine();
        System.out.print("Student Email: ");
        String semail=sc.nextLine();
        Student student=new Student(sname,semail);

        student.enrollCourse(course);
        course.showCourse();

        //simulate progress
        for(int i=0;i<n;i++){
            System.out.print("Complete module "+(i+1)+"? (yes/no): ");
            String ans=sc.next();
            if(ans.equalsIgnoreCase("yes")){
                student.completeModule();
            }
        }

        student.showProgress();
        student.generateCertificate();
        course.showReviews();
    }
}
