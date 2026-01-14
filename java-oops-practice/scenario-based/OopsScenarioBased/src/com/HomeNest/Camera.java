package com.HomeNest;
// Camera device
public class Camera extends Device{
    public Camera(String deviceId){
        super(deviceId,1.2);
    }
    // Reset behavior for camera
    public void reset(){
        System.out.println(deviceId+" camera angle recalibrated");
    }
}
