package com.collectors.employeesalary;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Alice", "IT", 70000),
            new Employee("Bob", "HR", 50000),
            new Employee("Charlie", "IT", 90000),
            new Employee("David", "Finance", 80000),
            new Employee("Eva", "HR", 55000)
        );

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        // Print result
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + " -> Average Salary: " + avgSalary)
        );
    }
}
