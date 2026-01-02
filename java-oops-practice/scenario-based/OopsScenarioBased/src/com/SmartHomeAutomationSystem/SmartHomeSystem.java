package com.SmartHomeAutomationSystem;
import java.util.ArrayList;

//main class
public class SmartHomeSystem{
  public static void main(String[] args){

      Appliance light=new Light(10);
      Appliance fan=new Fan(75);
      Appliance ac=new AC(1500);

      UserController controller=new UserController();
      controller.addAppliance(light);
      controller.addAppliance(fan);
      controller.addAppliance(ac);

      System.out.println("Turning ON all appliances");
      controller.controlAll(true);

      System.out.println("\nCurrent Status:");
      controller.showStatus();

      System.out.println("Turning OFF all appliances");
      controller.controlAll(false);
  }
}
