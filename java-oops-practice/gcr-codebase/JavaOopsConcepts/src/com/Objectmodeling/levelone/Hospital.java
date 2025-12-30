package com.Objectmodeling.levelone;
import java.util.ArrayList;

class Hospital{
    String hospitalName;
    ArrayList<Doctor> doctors=new ArrayList<>();
    ArrayList<Patient> patients=new ArrayList<>();

    //constructor
    public Hospital(String hospitalName){
        this.hospitalName=hospitalName;
    }

    //add doctor
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    //add patient
    public void addPatient(Patient patient){
        patients.add(patient);
    }

    //show hospital details
    public void showHospitalInfo(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Doctors Available:");
        for(Doctor d:doctors){
            System.out.println("- Dr. "+d.name);
        }
        System.out.println("Patients Registered:");
        for(Patient p:patients){
            System.out.println("- "+p.name);
        }
    }
}

