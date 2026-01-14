package com.Objectmodeling.levelone;

import java.util.ArrayList;

class University{
    String universityName;
    ArrayList<Department> departments=new ArrayList<>();
    ArrayList<Faculty> faculties=new ArrayList<>();

    //Constructor
    public University(String universityName){
        this.universityName=universityName;
    }

    public void addDepartment(Department d){
        departments.add(d);
    }

    public void addFaculty(Faculty f){
        faculties.add(f);
    }

    //Printing the details 
    public void showDetails(){
        System.out.println("University: "+universityName);
        System.out.println("Departments:");
        for(Department d:departments){
            System.out.println("- "+d.deptName);
        }
        System.out.println("Faculties:");
        for(Faculty f:faculties){
            System.out.println("- "+f.name);
        }
    }
}

