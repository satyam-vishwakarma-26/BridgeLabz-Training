package com.ZipZipMart;
import java.time.LocalDate;
public class SaleRecord{
    LocalDate date;
    double amount;
    
    //SaleRecord constructor 
    public SaleRecord(LocalDate date,double amount){
        this.date=date;
        this.amount=amount;
    }
    public void display(){
        System.out.println(date+" | Amount: "+amount);
    }
}
