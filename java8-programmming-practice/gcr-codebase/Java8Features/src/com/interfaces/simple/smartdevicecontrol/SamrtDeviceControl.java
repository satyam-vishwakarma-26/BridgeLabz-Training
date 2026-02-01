package com.interfaces.simple.smartdevicecontrol;
public class SamrtDeviceControl {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}