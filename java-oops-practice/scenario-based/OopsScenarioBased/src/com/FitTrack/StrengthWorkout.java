package com.FitTrack;

public class StrengthWorkout extends Workout{

	//constructor
    public StrengthWorkout(int duration){
        super("Strength",duration);
    }

    //polymorphic calorie calculation
    public void calculateCalories(double weight){
        caloriesBurned=duration*0.08*weight;
    }
}
