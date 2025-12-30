package com.Objectmodeling.levelone;

public class HospitalAssociation{
    public static void main(String[] args){

        //create hospital
        Hospital hospital=new Hospital("City Care Hospital");

        //create doctors
        Doctor d1=new Doctor("Sharma");
        Doctor d2=new Doctor("Verma");

        //create patients
        Patient p1=new Patient("Rohan");
        Patient p2=new Patient("Anjali");
        Patient p3=new Patient("Amit");

        //add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        //show hospital info
        hospital.showHospitalInfo();

        //consultations (association + communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);
        d2.consult(p3);

        //show consultations
        d1.showPatients();
        d2.showPatients();
    }
}
