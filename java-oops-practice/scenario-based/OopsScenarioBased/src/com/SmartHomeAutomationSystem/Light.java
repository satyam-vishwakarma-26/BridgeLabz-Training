package com.SmartHomeAutomationSystem;

//Light class
class Light extends Appliance{
  public Light(int powerUsage){
      super("Light",powerUsage);
  }

  public void turnOn(){
      setStatus(true);
      System.out.println("Light turned ON with soft brightness");
  }

  public void turnOff(){
      setStatus(false);
      System.out.println("Light turned OFF");
  }
}

