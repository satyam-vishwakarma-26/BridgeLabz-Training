package com.HomeNest;
// Base class for all smart home devices
public abstract class Device implements IControllable{
    protected String deviceId;
    private boolean status;
    protected double energyUsage;
    protected Device(String deviceId,double energyUsage){
        this.deviceId=deviceId;
        this.energyUsage=energyUsage;
        this.status=false;
        firmwareLog();
    }
    // Turn device ON
    public void turnOn(){
        status=true;
        System.out.println(deviceId+" is ON");
    }
    // Turn device OFF
    public void turnOff(){
        status=false;
        System.out.println(deviceId+" is OFF");
    }
    // Check device status
    public boolean getStatus(){
        return status;
    }
    // Energy calculation using operator
    public double calculateEnergy(int hours){
        return energyUsage*hours;
    }
    // Secure firmware update log
    protected void firmwareLog(){
        System.out.println("Firmware verified for "+deviceId);
    }
}
