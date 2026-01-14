package com.HospitalPatientManagementSystem;

//Main class
public class HospitalManagementSystem{
  public static void main(String[] args){

      //create doctor
      Doctor doc1=new Doctor(101,"Dr. Sharma","Cardiologist");

      //create patients
      Patient p1=new InPatient(1,"Rohan",30,"Heart Problem",5,2000);
      Patient p2=new OutPatient(2,"Amit",25,500);

      //assign doctor
      p1.assignDoctor(doc1);
      p2.assignDoctor(doc1);

      //polymorphism
      Patient[] patients={p1,p2};

      for(Patient p:patients){
          System.out.println("\n--- Patient Details ---");
          p.displayInfo();

          double billAmount=0;

          if(p instanceof InPatient){
              billAmount=((InPatient)p).getTotalCharge();
          }else if(p instanceof OutPatient){
              billAmount=((OutPatient)p).getConsultationFee();
          }

          Bill bill=new Bill(billAmount);
          System.out.println("Final Bill Amount: "+bill.calculatePayment());
      }
  }
}
