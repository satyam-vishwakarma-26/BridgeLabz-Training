package com.ExamProctor;
import java.util.Scanner;

// Test class for ExamProctor system
public class ExamProctorApp{
    public static void main(String[] args){
       
    	//Creating Scanner class object 
    	Scanner sc=new Scanner(System.in);
        ExamProctor exam=new ExamProctor();
        int choice;
       
        // Preload exam questions
        exam.addQuestion(1,"A");
        exam.addQuestion(2,"B");
        exam.addQuestion(3,"C");
       
        // Menu driven exam system
        do{
            System.out.println("\n1.Visit Question\n2.Submit Answer\n3.Go Back\n4.Submit Exam\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter question ID: ");
                    int qid=sc.nextInt();
                    exam.visitQuestion(qid);
                    break;
                case 2:
                    System.out.print("Enter question ID: ");
                    int aid=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter answer: ");
                    String ans=sc.nextLine();
                    exam.submitAnswer(aid,ans);
                    break;
                case 3:
                    exam.goBack();
                    break;
                case 4:
                    exam.evaluate();
                    break;
                case 0:
                    System.out.println("Exam session ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
