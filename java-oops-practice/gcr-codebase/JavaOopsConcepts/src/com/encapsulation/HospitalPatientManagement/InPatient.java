package com.encapsulation.HospitalPatientManagement;

import java.util.ArrayList;

//InPatient class
class InPatient extends Patient implements MedicalRecord{
  private int daysAdmitted ;
  private double dailyCharge;
  private ArrayList<String> records=new ArrayList<>();

  public InPatient(int patientId,String name,int age,int daysAdmitted,double dailyCharge){
      super(patientId,name,age);
      this.daysAdmitted=daysAdmitted;
      this.dailyCharge=dailyCharge;
  }

  @Override
  public double calculateBill(){
      return daysAdmitted*dailyCharge;
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
