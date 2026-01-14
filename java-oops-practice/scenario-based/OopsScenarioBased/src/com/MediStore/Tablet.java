package com.MediStore;
import java.time.LocalDate;

public class Tablet extends Medicine{
    public Tablet(String name,double price,LocalDate expiryDate,int qty){
        super(name,price,expiryDate,qty);
    }
    @Override
    public boolean checkExpiry(){
        return LocalDate.now().isAfter(getExpiryDate());
    }
}
