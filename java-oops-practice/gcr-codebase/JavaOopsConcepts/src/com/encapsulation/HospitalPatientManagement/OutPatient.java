package com.encapsulation.HospitalPatientManagement;

import java.util.ArrayList;

//OutPatient class
class OutPatient extends Patient implements MedicalRecord{
  private double consultationFee;
  private ArrayList<String> records=new ArrayList<>();

  public OutPatient(int patientId,String name,int age,double consultationFee){
      super(patientId,name,age);
      this.consultationFee=consultationFee;
  }

  @Override
  public double calculateBill(){
      return consultationFee;
  }

  @Override
  public void addRecord(String record){
      records.add(record);
  }

  @Override
  public void viewRecords(){
      System.out.println("Medical Records:");
      for(String r:records){
          System.out.println("- "+r);
      }
  }
}
