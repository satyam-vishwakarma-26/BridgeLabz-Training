package com.PayXpress;
import java.time.LocalDate;
// Electricity bill implementation
public class ElectricityBill extends Bill{
    public ElectricityBill(double amount,LocalDate dueDate){
        super("Electricity",amount,dueDate);
    }
    // Reminder behavior for electricity
    public void sendReminder(){
        System.out.println("Electricity bill reminder: High usage detected");
    }
}
