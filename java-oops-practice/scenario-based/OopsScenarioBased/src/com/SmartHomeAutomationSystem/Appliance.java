package com.SmartHomeAutomationSystem;

//abstract appliance class
abstract class Appliance implements Controllable{
  private String name;
  private int powerUsage;
  private boolean status;

  //constructor
  public Appliance(String name,int powerUsage){
      this.name=name;
      this.powerUsage=powerUsage;
      this.status=false;
  }

  //get appliance details
  public void getDetails(){
      System.out.println("Appliance: "+name);
      System.out.println("Power Usage: "+powerUsage+"W");
      System.out.println("Status: "+(status?"ON":"OFF"));
  }

  protected void setStatus(boolean status){
      this.status=status;
  }

  protected int getPowerUsage(){
      return powerUsage;
  }
}

