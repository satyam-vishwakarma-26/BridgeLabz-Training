package com.HomeNest;
// Camera device implementation
public class Camera extends Device{
    public Camera(String deviceId){
        super(deviceId,1.5);
    }
    // Reset behavior for camera
    public void reset(){
        System.out.println(deviceId+" camera angle reset");
    }
}
