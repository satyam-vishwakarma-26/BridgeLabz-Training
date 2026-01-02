package com.HospitalPatientManagementSystem;

//InPatient class
class InPatient extends Patient{
  private int daysAdmitted;
  private double dailyCharge;

  public InPatient(int patientId,String name,int age,String medicalHistory,int daysAdmitted,double dailyCharge){
      super(patientId,name,age,medicalHistory);
      this.daysAdmitted=daysAdmitted;
      this.dailyCharge=dailyCharge;
  }

  public double getTotalCharge(){
      return daysAdmitted*dailyCharge;
  }

  @Override
  public void displayInfo(){
      System.out.println(getSummary());
      System.out.println("Patient Type: InPatient");
      System.out.println("Days Admitted: "+daysAdmitted);
      System.out.println("Daily Charge: "+dailyCharge);
      if(doctor!=null){
          doctor.displayInfo();
      }
  }
}
