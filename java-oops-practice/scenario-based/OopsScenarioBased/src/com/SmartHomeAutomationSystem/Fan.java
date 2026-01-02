package com.SmartHomeAutomationSystem;

//Fan class
class Fan extends Appliance{
  public Fan(int powerUsage){
      super("Fan",powerUsage);
  }

  public void turnOn(){
      setStatus(true);
      System.out.println("Fan started spinning");
  }

  public void turnOff(){
      setStatus(false);
      System.out.println("Fan stopped");
  }
}
