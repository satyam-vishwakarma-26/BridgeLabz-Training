package com.EduResults;
import java.util.Scanner;

// Test class for EduResults system
public class EduResultsApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EduResultsManager manager=new EduResultsManager();
        int choice;

        // Menu driven rank generation system
        do{
            System.out.println("\n1.Add Student\n2.Generate Rank List\n3.Display Rank List\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter student name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter score: ");
                    int score=sc.nextInt();
                    manager.addStudent(name,score);
                    break;
                case 2:
                    manager.generateRankList();
                    break;
                case 3:
                    manager.displayRanks();
                    break;
                case 0:
                    System.out.println("EduResults system closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        
    }
}
