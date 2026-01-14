package com.HomeNest;
// Light device
public class Light extends Device{
    public Light(String deviceId){
        super(deviceId,0.5);
    }
    // Reset behavior for light
    public void reset(){
        System.out.println(deviceId+" brightness reset to default");
    }
}
