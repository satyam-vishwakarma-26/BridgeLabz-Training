package com.FitnessTracker;

// Represents a user's daily step count
public class UserSteps{
    String userName;
    int steps;
    public UserSteps(String userName,int steps){
        this.userName=userName;
        this.steps=steps;
    }

    // Display user step info
    public void display(){
        System.out.println(userName+" | Steps: "+steps);
    }
}
