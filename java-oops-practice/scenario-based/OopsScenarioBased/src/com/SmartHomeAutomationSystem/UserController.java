package com.SmartHomeAutomationSystem;
import java.util.ArrayList;

//controller class
class UserController{
  ArrayList<Appliance> appliances=new ArrayList<>();

  public void addAppliance(Appliance appliance){
      appliances.add(appliance);
  }

  public void controlAll(boolean turnOn){
      for(Appliance a:appliances){
          if(turnOn){
              a.turnOn();
          }else{
              a.turnOff();
          }
      }
  }

  public void showStatus(){
      for(Appliance a:appliances){
          a.getDetails();
          System.out.println("------------------");
      }
  }
}

