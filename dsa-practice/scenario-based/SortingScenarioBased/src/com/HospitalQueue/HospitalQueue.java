package com.HospitalQueue;
import java.util.*;

// Manages patient list and sorting
public class HospitalQueue{
    private ArrayList<Patient> patients=new ArrayList<>();

    // Add patient to queue
    public void addPatient(String name,int criticality){
        patients.add(new Patient(name,criticality));
        System.out.println("Patient added");
    }
    
    // Bubble Sort by criticality (high to low)
    public void sortByCriticality(){
        int n=patients.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(patients.get(j).criticality<patients.get(j+1).criticality){
                    Patient temp=patients.get(j);
                    patients.set(j,patients.get(j+1));
                    patients.set(j+1,temp);
                }
            }
        }
        System.out.println("Patients sorted by criticality");
    }
    
    // Display patient list
    public void displayPatients(){
        if(patients.isEmpty()){
            System.out.println("No patients in ER");
            return;
        }
        for(Patient p:patients){
            p.display();
        }
    }
}
