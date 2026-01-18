package com.collections.map;
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    // groups employees by department
    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.putIfAbsent(e.department, new ArrayList<>());
            map.get(e.department).add(e);
        }
        return map;
    }

    //main method 
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> result = groupByDept(employees);

        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}