package com.FoodFest;
import java.util.*;

// Manages stall data and merge sort
public class FoodFestManager{
    private ArrayList<Stall> stalls=new ArrayList<>();

    // Add stall record
    public void addStall(String name,int footfall){
        stalls.add(new Stall(name,footfall));
        System.out.println("Stall added");
    }
    
    // Generate master list using merge sort
    public void generateMasterList(){
        if(stalls.size()>1){
            mergeSort(0,stalls.size()-1);
            System.out.println("Master list generated");
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
    
    // Merge step with stability (higher footfall first)
    private void merge(int left,int mid,int right){
        ArrayList<Stall> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid&&j<=right){
            if(stalls.get(i).footfall>=stalls.get(j).footfall){
                temp.add(stalls.get(i));
                i++;
            }else{
                temp.add(stalls.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(stalls.get(i));
            i++;
        }
        while(j<=right){
            temp.add(stalls.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            stalls.set(left+k,temp.get(k));
        }
    }
    // Display all stalls
    public void displayStalls(){
        if(stalls.isEmpty()){
            System.out.println("No stall data available");
            return;
        }
        for(Stall s:stalls){
            s.display();
        }
    }
}
