package com.PayXpress;
import java.time.LocalDate;
// Water bill implementation
public class WaterBill extends Bill{
    public WaterBill(double amount,LocalDate dueDate){
        super("Water",amount,dueDate);
    }
    // Reminder behavior for water
    public void sendReminder(){
        System.out.println("Water bill reminder: Pay before due date to avoid penalty");
    }
}
