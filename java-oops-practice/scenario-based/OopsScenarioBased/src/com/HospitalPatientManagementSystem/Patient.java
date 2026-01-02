package com.HospitalPatientManagementSystem;

//abstract Patient class
abstract class Patient{
  protected int patientId;
  protected String name;
  protected int age;
  private String medicalHistory; //sensitive data
  protected Doctor doctor;

  //normal patient constructor
  public Patient(int patientId,String name,int age,String medicalHistory){
      this.patientId=patientId;
      this.name=name;
      this.age=age;
      this.medicalHistory=medicalHistory;
  }

  //emergency patient constructor
  public Patient(int patientId,String name,int age){
      this.patientId=patientId;
      this.name=name;
      this.age=age;
      this.medicalHistory="Emergency Case";
  }

  //assign doctor
  public void assignDoctor(Doctor doctor){
      this.doctor=doctor;
  }

  //public summary (encapsulation)
  public String getSummary(){
      return "Patient ID: "+patientId+", Name: "+name+", Age: "+age;
  }

  //polymorphic method
  public abstract void displayInfo();
}
