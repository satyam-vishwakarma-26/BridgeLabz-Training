package com.Artify;
public class PrintArt extends Artwork{

	//constructor 
    public PrintArt(String title,String artist,double price,String licenseType){
        super(title,artist,price,licenseType);
    }

    //polymorphism
    @Override
    public void purchase(User user){
        double totalPrice=price+200; //printing charge
        if(user.deductAmount(totalPrice)){
            System.out.println("Print Art purchased (with delivery) 🖼️");
        }else{
            System.out.println("Insufficient balance ❌");
        }
    }

    @Override
    public void license(User user){
        double licenseFee=price*0.7;
        if(user.deductAmount(licenseFee)){
            System.out.println("Print Art licensed (Commercial Use) 📜");
        }else{
            System.out.println("Insufficient balance for license ❌");
        }
    }
}
