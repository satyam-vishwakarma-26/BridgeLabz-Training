package com.constructor.levelone;

public class EmployeeDriver {

    public static void main(String[] args) {

        Manager m =
                new Manager(1001,
                            "IT",
                            75000,
                            "Senior");

        m.displayManagerDetails();

        System.out.println("-----");

        // modify salary using setter
        m.setSalary(82000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

