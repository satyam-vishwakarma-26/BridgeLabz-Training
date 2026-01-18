package com.BagnBallOrganizer;
import java.util.*;
// Represents a bag that holds balls
public class Bag implements Storable{
    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls=new ArrayList<>();
    public Bag(String id,String color,int capacity){
        this.id=id;
        this.color=color;
        this.capacity=capacity;
    }
    public String getId(){
        return id;
    }
    public int getBallCount(){
        return balls.size();
    }
    // Add ball if capacity allows
    public void addBall(Ball ball){
        if(balls.size()>=capacity){
            System.out.println("Bag is full.Cannot add ball");
            return;
        }
        balls.add(ball);
        System.out.println("Ball added to bag "+id);
    }
    // Remove ball by ID
    public void removeBall(String ballId){
        Iterator<Ball> it=balls.iterator();
        while(it.hasNext()){
            if(it.next().getId().equals(ballId)){
                it.remove();
                System.out.println("Ball removed from bag "+id);
                return;
            }
        }
        System.out.println("Ball not found in bag");
    }
    // Display all balls in bag
    public void displayBalls(){
        if(balls.isEmpty()){
            System.out.println("No balls in bag "+id);
            return;
        }
        for(Ball b:balls){
            b.display();
        }
    }
    // Display bag summary
    public void displayBag(){
        System.out.println("Bag ID:"+id+" Color:"+color+" Balls:"+balls.size()+"/"+capacity);
    }
}
