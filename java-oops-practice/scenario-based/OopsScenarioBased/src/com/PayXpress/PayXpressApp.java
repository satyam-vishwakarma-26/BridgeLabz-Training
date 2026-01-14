package com.PayXpress;
import java.time.LocalDate;
// Test class for PayXpress system
public class PayXpressApp{
    public static void main(String[] args){
        Bill electricity=new ElectricityBill(1200,LocalDate.now().plusDays(5));
        Bill water=new WaterBill(500,LocalDate.now().plusDays(3));
        Bill internet=new InternetBill(999,LocalDate.now().plusDays(7));
        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();
        electricity.pay();
        water.pay();
        System.out.println("Late fee electricity: "+electricity.calculateLateFee(100));
    }
}
