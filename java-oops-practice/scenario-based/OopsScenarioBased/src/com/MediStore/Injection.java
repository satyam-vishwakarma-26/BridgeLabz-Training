package com.MediStore;
import java.time.LocalDate;

public class Injection extends Medicine{
	//constructor for initializing the variable
    public Injection(String name,double price,LocalDate expiryDate,int qty){
        super(name,price,expiryDate,qty);
    }
    @Override
    public boolean checkExpiry(){
        return LocalDate.now().isAfter(getExpiryDate().minusDays(7));
    }
}
