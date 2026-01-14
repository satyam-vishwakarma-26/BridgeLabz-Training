package com.Objectmodeling.levelone;

import java.util.ArrayList;

class Company{
    String companyName;
    ArrayList<Department> departments=new ArrayList<>();

    public Company(String companyName){
        this.companyName=companyName;
    }

    //add department
    public void addDepartment(Department dept){
        departments.add(dept);
    }

    //display company structure
    public void showCompany(){
        System.out.println("Company: "+companyName);
        for(Department d:departments){
            d.showDepartment();
        }
    }

    //delete company (composition effect)
    public void deleteCompany(){
        departments.clear(); //all departments & employees removed
        System.out.println("Company deleted along with all departments and employees");
    }
}
