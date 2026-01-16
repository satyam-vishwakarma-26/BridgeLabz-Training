package com.CropMonitor;
import java.util.*;
// Manages sensor data and sorting
public class CropMonitorManager{
    private ArrayList<SensorData> dataList=new ArrayList<>();
    // Add sensor reading
    public void addData(long timestamp,double temperature){
        dataList.add(new SensorData(timestamp,temperature));
        System.out.println("Sensor data added");
    }
    // Public method to sort sensor data
    public void sortByTimestamp(){
        if(dataList.size()>1){
            quickSort(0,dataList.size()-1);
            System.out.println("Sensor data sorted by timestamp");
        }
    }
    // Quick sort recursive method
    private void quickSort(int low,int high){
        if(low<high){
            int pivotIndex=partition(low,high);
            quickSort(low,pivotIndex-1);
            quickSort(pivotIndex+1,high);
        }
    }
    // Partition based on timestamp
    private int partition(int low,int high){
        long pivot=dataList.get(high).timestamp;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(dataList.get(j).timestamp<=pivot){
                i++;
                SensorData temp=dataList.get(i);
                dataList.set(i,dataList.get(j));
                dataList.set(j,temp);
            }
        }
        SensorData temp=dataList.get(i+1);
        dataList.set(i+1,dataList.get(high));
        dataList.set(high,temp);
        return i+1;
    }
    // Display all sensor data
    public void displayData(){
        if(dataList.isEmpty()){
            System.out.println("No sensor data available");
            return;
        }
        for(SensorData d:dataList){
            d.display();
        }
    }
}
