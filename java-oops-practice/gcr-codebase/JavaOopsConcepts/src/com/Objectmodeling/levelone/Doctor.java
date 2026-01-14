package com.Objectmodeling.levelone;
import java.util.ArrayList;

class Doctor{
    String name;
    ArrayList<Patient> patients=new ArrayList<>();

    //constructor
    public Doctor(String name){
        this.name=name;
    }

    //consultation method (communication)
    public void consult(Patient patient){
        patients.add(patient);
        System.out.println("Doctor "+name+" is consulting patient "+patient.name);
    }

    //show all consulted patients
    public void showPatients(){
        System.out.println("\nPatients consulted by Dr. "+name+":");
        for(Patient p:patients){
            System.out.println("- "+p.name);
        }
    }
}
