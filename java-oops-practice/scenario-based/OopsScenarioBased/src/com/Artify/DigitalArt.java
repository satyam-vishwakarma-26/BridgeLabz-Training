package com.Artify;
public class DigitalArt extends Artwork{

	//constructor for initializing the object 
    public DigitalArt(String title,String artist,double price,String licenseType){
        super(title,artist,price,licenseType);
    }

    //polymorphism
    @Override
    public void purchase(User user){
        if(user.deductAmount(price)){
            System.out.println("Digital Art purchased successfully ✅");
        }else{
            System.out.println("Insufficient balance ❌");
        }
    }

    @Override
    public void license(User user){
        double licenseFee=price*0.5;
        if(user.deductAmount(licenseFee)){
            System.out.println("Digital Art licensed (Personal Use) 🎧");
        }else{
            System.out.println("Insufficient balance for license ❌");
        }
    }
}
