package com.TourMate;
public class Transport implements IBookable{
    private String mode;
    private double cost;

    public Transport(String mode,double cost){
        this.mode=mode;
        this.cost=cost;
    }

    public double getCost(){
        return cost;
    }

    @Override
    public void book(){
        System.out.println("Transport booked: "+mode);
    }

    @Override
    public void cancel(){
        System.out.println("Transport booking cancelled");
    }
}
