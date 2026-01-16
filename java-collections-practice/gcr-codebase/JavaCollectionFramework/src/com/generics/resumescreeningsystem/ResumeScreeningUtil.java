package com.generics.resumescreeningsystem;
import java.util.*;
// Utility class using generics and wildcards
public class ResumeScreeningUtil{
    // Generic method to screen a resume
    public static <T extends JobRole> void screenResume(Resume<T> resume){
        System.out.println("AI Screening Started");
        resume.display();
        System.out.println("Screening Completed");
    }
    // Wildcard method to process mixed job roles
    public static void processPipeline(List<? extends JobRole> roles){
        System.out.println("Processing screening pipeline");
        for(JobRole role:roles){
            System.out.println("Pipeline ready for: "+role.getRoleName());
        }
    }
}
