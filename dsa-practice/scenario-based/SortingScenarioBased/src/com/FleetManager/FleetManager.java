package com.FleetManager;
import java.util.*;

// Manages vehicle lists and merge sort
public class FleetManager{
    private ArrayList<Vehicle> vehicles=new ArrayList<>();

    // Add vehicle from depot (already sorted input assumed)
    public void addVehicle(String id,int mileage){
        vehicles.add(new Vehicle(id,mileage));
        System.out.println("Vehicle added");
    }
    
    // Public method to create master maintenance schedule
    public void generateSchedule(){
        if(vehicles.size()>1){
            mergeSort(0,vehicles.size()-1);
            System.out.println("Master maintenance schedule generated");
        }
    }
    
    // Merge sort divide step
    private void mergeSort(int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(left,mid);
            mergeSort(mid+1,right);
            merge(left,mid,right);
        }
    }
    
    // Merge step based on mileage
    private void merge(int left,int mid,int right){
        ArrayList<Vehicle> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid&&j<=right){
            if(vehicles.get(i).mileage<=vehicles.get(j).mileage){
                temp.add(vehicles.get(i));
                i++;
            }else{
                temp.add(vehicles.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(vehicles.get(i));
            i++;
        }
        while(j<=right){
            temp.add(vehicles.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            vehicles.set(left+k,temp.get(k));
        }
    }
    
    // Display master schedule
    public void displaySchedule(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles scheduled");
            return;
        }
        for(Vehicle v:vehicles){
            v.display();
        }
    }
}
