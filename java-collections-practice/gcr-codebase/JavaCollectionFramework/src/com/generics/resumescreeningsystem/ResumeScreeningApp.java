package com.generics.resumescreeningsystem;
import java.util.*;
// Test class for AI Driven Resume Screening System with user input
public class ResumeScreeningApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<JobRole> pipeline=new ArrayList<>();
        int choice;
        do{
            System.out.println("\n1.Add Software Engineer Resume\n2.Add Data Scientist Resume\n3.Add Product Manager Resume\n4.Process Screening Pipeline\n0.Exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter candidate name: ");
                    String seName=sc.nextLine();
                    Resume<SoftwareEngineer> seResume=new Resume<>(seName,new SoftwareEngineer());
                    ResumeScreeningUtil.screenResume(seResume);
                    pipeline.add(new SoftwareEngineer());
                    break;
                case 2:
                    System.out.print("Enter candidate name: ");
                    String dsName=sc.nextLine();
                    Resume<DataScientist> dsResume=new Resume<>(dsName,new DataScientist());
                    ResumeScreeningUtil.screenResume(dsResume);
                    pipeline.add(new DataScientist());
                    break;
                case 3:
                    System.out.print("Enter candidate name: ");
                    String pmName=sc.nextLine();
                    Resume<ProductManager> pmResume=new Resume<>(pmName,new ProductManager());
                    ResumeScreeningUtil.screenResume(pmResume);
                    pipeline.add(new ProductManager());
                    break;
                case 4:
                    if(pipeline.isEmpty()){
                        System.out.println("No resumes in pipeline");
                    }else{
                        ResumeScreeningUtil.processPipeline(pipeline);
                    }
                    break;
                case 0:
                    System.out.println("Resume screening closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
