package com.FitTrack;

public class CardioWorkout extends Workout{

	//Constructor
    public CardioWorkout(int duration){
        super("Cardio",duration);
    }

    //polymorphic calorie calculation
    public void calculateCalories(double weight){
        caloriesBurned=duration*0.1*weight;
    }
}
