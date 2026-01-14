package com.HomeNest;
// Smart lock device
public class Lock extends Device{
    public Lock(String deviceId){
        super(deviceId,0.2);
    }
    // Reset behavior for lock
    public void reset(){
        System.out.println(deviceId+" lock security keys refreshed");
    }
}
