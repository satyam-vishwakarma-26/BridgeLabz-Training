package com.FitTrack;

public abstract class Workout implements ITrackable{
    protected String type;
    protected int duration; //minutes
    protected double caloriesBurned;
    private boolean active; //internal log

    //constructor
    public Workout(String type,int duration){
        this.type=type;
        this.duration=duration;
    }

    //Method 
    public void startWorkout(){
        active=true;
        System.out.println(type+" workout started");
    }

    //Method 
    public void stopWorkout(){
        active=false;
        System.out.println(type+" workout stopped");
    }

    public abstract void calculateCalories(double weight);

    public double getCaloriesBurned(){
        return caloriesBurned;
    }

    //When call print the result 
    public void showWorkout(){
        System.out.println("Workout: "+type);
        System.out.println("Duration: "+duration+" minutes");
        System.out.println("Calories Burned: "+caloriesBurned);
    }
}
