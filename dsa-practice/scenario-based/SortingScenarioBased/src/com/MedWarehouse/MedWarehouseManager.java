package com.MedWarehouse;
import java.util.*;

// Manages medicine data and merge sort
public class MedWarehouseManager{
    private ArrayList<Medicine> medicines=new ArrayList<>();

    // Add medicine record
    public void addMedicine(String name,int expiryDays){
        medicines.add(new Medicine(name,expiryDays));
        System.out.println("Medicine added");
    }
    
    // Generate sorted list using merge sort
    public void sortByExpiry(){
        if(medicines.size()>1){
            mergeSort(0,medicines.size()-1);
            System.out.println("Medicines sorted by expiry");
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
    
    // Merge step (earliest expiry first)
    private void merge(int left,int mid,int right){
        ArrayList<Medicine> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid&&j<=right){
            if(medicines.get(i).expiryDays<=medicines.get(j).expiryDays){
                temp.add(medicines.get(i));
                i++;
            }else{
                temp.add(medicines.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(medicines.get(i));
            i++;
        }
        while(j<=right){
            temp.add(medicines.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            medicines.set(left+k,temp.get(k));
        }
    }
    
    // Display all medicines
    public void displayMedicines(){
        if(medicines.isEmpty()){
            System.out.println("No medicine records");
            return;
        }
        for(Medicine m:medicines){
            m.display();
        }
    }
}
