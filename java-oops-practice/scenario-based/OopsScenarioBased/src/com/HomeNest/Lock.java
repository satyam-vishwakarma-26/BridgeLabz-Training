package com.HomeNest;
// Smart lock device implementation
public class Lock extends Device{
    public Lock(String deviceId){
        super(deviceId,0.3);
    }
    // Reset behavior for lock
    public void reset(){
        System.out.println(deviceId+" security keys refreshed");
    }
}
