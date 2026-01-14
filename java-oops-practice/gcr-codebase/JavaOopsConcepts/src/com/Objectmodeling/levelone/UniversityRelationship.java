package com.Objectmodeling.levelone;

public class UniversityRelationship{
    public static void main(String[] args){
    	
    	
    	//Creating the object and constructor called 
        University uni=new University("RGPV University");

        Department d1=new Department("Computer Science");
        Department d2=new Department("Mechanical");

        Faculty f1=new Faculty("Dr. Sharma");
        Faculty f2=new Faculty("Dr. Mehta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        //University deleted → Departments deleted (Composition)
        uni=null;
        System.out.println("\nUniversity deleted. Departments removed.");

        //Faculty still exists (Aggregation)
        System.out.println("Faculty still exists: "+f1.name);
    }
}
