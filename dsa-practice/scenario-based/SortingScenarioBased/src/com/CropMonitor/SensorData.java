package com.CropMonitor;
// Represents a single sensor reading
public class SensorData{
    long timestamp;
    double temperature;
    public SensorData(long timestamp,double temperature){
        this.timestamp=timestamp;
        this.temperature=temperature;
    }
    // Display sensor data
    public void display(){
        System.out.println("Time: "+timestamp+" | Temp: "+temperature);
    }
}
