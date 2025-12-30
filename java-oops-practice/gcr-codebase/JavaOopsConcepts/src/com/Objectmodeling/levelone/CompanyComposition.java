package com.Objectmodeling.levelone;

public class CompanyComposition{
    public static void main(String[] args){

        //create company
        Company company=new Company("TechNova Pvt Ltd");

        //create departments
        Department dev=new Department("Development");
        Department hr=new Department("HR");

        //add employees
        dev.addEmployee("Rohan",101);
        dev.addEmployee("Amit",102);

        hr.addEmployee("Neha",201);
        hr.addEmployee("Pooja",202);

        //add departments to company
        company.addDepartment(dev);
        company.addDepartment(hr);

        //display company structure
        company.showCompany();

        //delete company
        System.out.println("\nDeleting company...");
        company.deleteCompany();
    }
}
