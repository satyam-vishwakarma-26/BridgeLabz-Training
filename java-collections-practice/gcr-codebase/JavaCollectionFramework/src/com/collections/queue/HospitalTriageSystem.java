package com.collections.queue;
import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {
    	//Created Scanner Class Object for taking user inputs 
        Scanner sc = new Scanner(System.in);

        // higher severity treated first
        PriorityQueue<Patient> queue =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Severity: ");
            int severity = sc.nextInt();
            sc.nextLine();

            queue.add(new Patient(name, severity));
        }

        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}