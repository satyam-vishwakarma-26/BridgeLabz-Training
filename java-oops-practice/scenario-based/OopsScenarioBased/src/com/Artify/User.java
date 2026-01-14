package com.Artify;
public class User{
    private String name;
    private double walletBalance;

    //constructor 
    public User(String name,double walletBalance){
        this.name=name;
        this.walletBalance=walletBalance;
    }

    //Getters 
    public String getName(){
        return name;
    }

    public double getWalletBalance(){
        return walletBalance;
    }

    //deduct amount (encapsulation)
    public boolean deductAmount(double amount){
        if(walletBalance>=amount){
            walletBalance-=amount;
            return true;
        }
        return false;
    }

    public void showUser(){
        System.out.println("User Name      : "+name);
        System.out.println("Wallet Balance : ₹"+walletBalance);
    }
}
