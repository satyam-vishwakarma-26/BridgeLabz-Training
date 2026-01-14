package com.MediStore;
import java.time.LocalDate;

public class Syrup extends Medicine{
    public Syrup(String name,double price,LocalDate expiryDate,int qty){
        super(name,price,expiryDate,qty);
    }
    @Override
    public boolean checkExpiry(){
        return LocalDate.now().isAfter(getExpiryDate().minusDays(3));
    }
}
