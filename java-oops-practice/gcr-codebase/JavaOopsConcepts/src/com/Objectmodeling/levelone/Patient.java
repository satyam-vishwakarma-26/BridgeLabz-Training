package com.Objectmodeling.levelone;

import java.util.ArrayList;

//Patient class
class Patient{
  String name;

  //constructor
  public Patient(String name){
      this.name=name;
  }

  //view patient details
  public void showPatient(){
      System.out.println("Patient Name: "+name);
  }
}
