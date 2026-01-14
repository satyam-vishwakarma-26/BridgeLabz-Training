package com.PayXpress;
import java.time.LocalDate;
// Internet bill implementation
public class InternetBill extends Bill{
    public InternetBill(double amount,LocalDate dueDate){
        super("Internet",amount,dueDate);
    }
    // Reminder behavior for internet
    public void sendReminder(){
        System.out.println("Internet bill reminder: Service interruption possible");
    }
}
