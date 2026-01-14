package com.EduMentor;

import java.util.Scanner;

public class EduMentorApp{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        //----- Learner Input -----
        System.out.println("Enter Learner Details");
        System.out.print("User ID: ");
        int lid=sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String lname=sc.nextLine();

        System.out.print("Email: ");
        String lemail=sc.nextLine();

        System.out.print("Course Type (Short / Full-time): ");
        String courseType=sc.nextLine();

        Learner learner=new Learner(lid,lname,lemail,courseType);

        //----- Instructor Input -----
        System.out.println("\nEnter Instructor Details");
        System.out.print("User ID: ");
        int iid=sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String iname=sc.nextLine();

        System.out.print("Email: ");
        String iemail=sc.nextLine();

        System.out.print("Specialization: ");
        String specialization=sc.nextLine();

        Instructor instructor=new Instructor(iid,iname,iemail,specialization);

        //----- Display Basic Details -----
        System.out.println("\n--- Basic Details ---");
        learner.printDetails();
        System.out.println();
        instructor.printDetails();

        //----- Quiz Creation -----
        Quiz quiz=new Quiz("Medium");

        quiz.setQuestion(0,"Java is platform independent?","yes");
        quiz.setQuestion(1,"OOP stands for Object Oriented Programming?","yes");
        quiz.setQuestion(2,"JVM stands for Java Virtual Machine?","yes");
        quiz.setQuestion(3,"HTML is a programming language?","no");
        quiz.setQuestion(4,"AI stands for Artificial Intelligence?","yes");

        //----- Show Questions -----
        quiz.showQuestions();

        //----- User Answers -----
        String[] userAnswers=new String[5];
        System.out.println("\nEnter your answers (yes/no):");
        for(int i=0;i<5;i++){
            System.out.print("Answer "+(i+1)+": ");
            userAnswers[i]=sc.nextLine();
        }

        quiz.evaluate(userAnswers);

        //----- Result -----
        System.out.println("\n--- Quiz Result ---");
        quiz.showResult();

        System.out.println("\n--- Certificate ---");
        learner.generateCertificate();
    }
}
