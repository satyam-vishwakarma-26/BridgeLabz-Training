package com.encapsulation.HospitalPatientManagement;

//Abstract Patient class
abstract class Patient{
  private int patientId;
  private String name;
  private int age;
  private String diagnosis; //encapsulated sensitive data

  //constructor
  public Patient(int patientId,String name,int age){
      this.patientId=patientId;
      this.name=name;
      this.age=age;
  }

  //getters and setters
  public int getPatientId(){
      return patientId;
  }

  public String getName(){
      return name;
  }

  public int getAge(){
      return age;
  }

  public void setDiagnosis(String diagnosis){
      this.diagnosis=diagnosis;
  }

  protected String getDiagnosis(){
      return diagnosis;
  }

  //concrete method
  public void getPatientDetails(){
      System.out.println("Patient ID: "+patientId);
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
  }

  //abstract method
  public abstract double calculateBill();
}
