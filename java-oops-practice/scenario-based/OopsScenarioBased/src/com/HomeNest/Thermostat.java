package com.HomeNest;
// Thermostat device
public class Thermostat extends Device{
    public Thermostat(String deviceId){
        super(deviceId,2.0);
    }
    // Reset behavior for thermostat
    public void reset(){
        System.out.println(deviceId+" temperature reset to 24°C");
    }
}
