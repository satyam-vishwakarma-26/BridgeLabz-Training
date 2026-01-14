package com.HomeNest;
// Base class for all smart devices
public abstract class Device implements IControllable{
    protected String deviceId;
    private boolean status;
    protected double energyUsage;
    protected Device(String deviceId,double energyUsage){
        this.deviceId=deviceId;
        this.energyUsage=energyUsage;
        this.status=false;
        logFirmwareUpdate();
    }
    // Turn device ON
    public void turnOn(){
        status=true;
        System.out.println(deviceId+" turned ON");
    }
    // Turn device OFF
    public void turnOff(){
        status=false;
        System.out.println(deviceId+" turned OFF");
    }
    // Get device status
    public boolean getStatus(){
        return status;
    }
    // Energy usage calculation using operator
    public double calculateEnergy(int hours){
        return energyUsage*hours;
    }
    // Secure firmware update log
    protected void logFirmwareUpdate(){
        System.out.println("Firmware verified for "+deviceId);
    }
}
