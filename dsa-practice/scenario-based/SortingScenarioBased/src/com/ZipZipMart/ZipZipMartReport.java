package com.ZipZipMart;
import java.util.*;
import java.time.LocalDate;
public class ZipZipMartReport{
	
	//Arraylist for storing salesrecords 
    private ArrayList<SaleRecord> records=new ArrayList<>();
    public void addRecord(LocalDate date,double amount){
        records.add(new SaleRecord(date,amount));
        System.out.println("Sale record added");
    }
    //methods 
    public void sortRecords(){
        if(records.size()>1){
            mergeSort(0,records.size()-1);
            System.out.println("Records sorted");
        }
    }
    //mergesort 
    private void mergeSort(int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(left,mid);
            mergeSort(mid+1,right);
            merge(left,mid,right);
        }
    }
    //merge method 
    private void merge(int left,int mid,int right){
        ArrayList<SaleRecord> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid&&j<=right){
            SaleRecord a=records.get(i);
            SaleRecord b=records.get(j);
            if(a.date.isBefore(b.date)||(a.date.isEqual(b.date)&&a.amount<=b.amount)){
                temp.add(a);
                i++;
            }else{
                temp.add(b);
                j++;
            }
        }
        while(i<=mid){
            temp.add(records.get(i));
            i++;
        }
        while(j<=right){
            temp.add(records.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            records.set(left+k,temp.get(k));
        }
    }
    public void displayRecords(){
        if(records.isEmpty()){
            System.out.println("No records found");
            return;
        }
        for(SaleRecord r:records){
            r.display();
        }
    }
}
