package com.encapsulation.HospitalPatientManagement;

//Main class
public class HospitalManagementSystem{
  public static void main(String[] args){

      //polymorphism
      Patient p1=new InPatient(101,"Rohan",45,5,2000);
      Patient p2=new OutPatient(102,"Anita",30,500);

      p1.setDiagnosis("Pneumonia");
      p2.setDiagnosis("Fever");

      //type casting for record handling
      MedicalRecord r1=(MedicalRecord)p1;
      MedicalRecord r2=(MedicalRecord)p2;

      r1.addRecord("Chest X-Ray");
      r1.addRecord("Antibiotics started");

      r2.addRecord("Blood Test");
      r2.addRecord("Prescribed medication");

      System.out.println("\n--- In Patient Details ---");
      p1.getPatientDetails();
      System.out.println("Bill Amount: ₹"+p1.calculateBill());
      r1.viewRecords();

      System.out.println("\n--- Out Patient Details ---");
      p2.getPatientDetails();
      System.out.println("Bill Amount: ₹"+p2.calculateBill());
      r2.viewRecords();
  }
}
