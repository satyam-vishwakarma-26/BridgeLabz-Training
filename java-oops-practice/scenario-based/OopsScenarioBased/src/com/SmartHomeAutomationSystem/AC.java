package com.SmartHomeAutomationSystem;

//AC class
class AC extends Appliance{
  public AC(int powerUsage){
      super("AC",powerUsage);
  }

  public void turnOn(){
      setStatus(true);
      System.out.println("AC cooling started");
  }

  public void turnOff(){
      setStatus(false);
      System.out.println("AC turned OFF");
  }
}

