package com.HospitalPatientManagementSystem;

//OutPatient class
class OutPatient extends Patient{
  private double consultationFee;

  public OutPatient(int patientId,String name,int age,double consultationFee){
      super(patientId,name,age);
      this.consultationFee=consultationFee;
  }

  public double getConsultationFee(){
      return consultationFee;
  }

  @Override
  public void displayInfo(){
      System.out.println(getSummary());
      System.out.println("Patient Type: OutPatient");
      System.out.println("Consultation Fee: "+consultationFee);
      if(doctor!=null){
          doctor.displayInfo();
      }
  }
}
