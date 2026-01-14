package com.PayXpress;
import java.time.LocalDate;
// Base class for all utility bills
public abstract class Bill implements IPayable{
    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;
    protected Bill(String type,double amount,LocalDate dueDate){
        this.type=type;
        this.amount=amount;
        this.dueDate=dueDate;
        this.isPaid=false;
    }
    // Calculate late fee using operator
    protected double calculateLateFee(double penalty){
        return amount+penalty;
    }
    // Mark bill as paid securely
    public void pay(){
        if(isPaid){
            System.out.println(type+" bill already paid");
            return;
        }
        isPaid=true;
        System.out.println(type+" bill paid successfully");
    }
    // Check payment status
    public boolean isPaid(){
        return isPaid;
    }
}
