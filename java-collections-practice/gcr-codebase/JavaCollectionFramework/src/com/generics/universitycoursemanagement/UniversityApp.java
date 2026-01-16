package com.generics.universitycoursemanagement;
import java.util.Scanner;
// Test class for University Course Management System with user input
public class UniversityApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        UniversityCatalog catalog=new UniversityCatalog();
        int choice;
        do{
            System.out.println("\n1.Add Exam Course\n2.Add Assignment Course\n3.Add Research Course\n4.Display All Courses\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter course code: ");
                    String ecode=sc.nextLine();
                    System.out.print("Enter course name: ");
                    String ename=sc.nextLine();
                    Course<ExamCourse> examCourse=new Course<>(ecode,ename,new ExamCourse());
                    catalog.addCourse(examCourse);
                    break;
                case 2:
                    System.out.print("Enter course code: ");
                    String acode=sc.nextLine();
                    System.out.print("Enter course name: ");
                    String aname=sc.nextLine();
                    Course<AssignmentCourse> assignCourse=new Course<>(acode,aname,new AssignmentCourse());
                    catalog.addCourse(assignCourse);
                    break;
                case 3:
                    System.out.print("Enter course code: ");
                    String rcode=sc.nextLine();
                    System.out.print("Enter course name: ");
                    String rname=sc.nextLine();
                    Course<ResearchCourse> researchCourse=new Course<>(rcode,rname,new ResearchCourse());
                    catalog.addCourse(researchCourse);
                    break;
                case 4:
                    System.out.println("--- University Course Catalog ---");
                    catalog.displayAllCourses();
                    break;
                case 0:
                    System.out.println("University system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
