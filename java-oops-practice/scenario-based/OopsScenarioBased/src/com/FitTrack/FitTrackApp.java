package com.FitTrack;

import java.util.Scanner;

public class FitTrackApp{
    public static void main(String[] args){

    	//Created Scanner Object for taking user inputs
        Scanner sc=new Scanner(System.in);

        // User Profile Input 
        System.out.println("Enter User Details");
        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Age: ");
        int age=sc.nextInt();

        System.out.print("Weight (kg): ");
        double weight=sc.nextDouble();
        sc.nextLine();

        System.out.print("Do you want to set a custom goal? (yes/no): ");
        String choice=sc.nextLine();

        UserProfile user;
        if(choice.equalsIgnoreCase("yes")){
            System.out.print("Enter your fitness goal: ");
            String goal=sc.nextLine();
            user=new UserProfile(name,age,weight,goal);
        }else{
            user=new UserProfile(name,age,weight);
        }

        //Display Profile 
        System.out.println("\n--- User Profile ---");
        user.showProfile();

        //Workout Selection 
        System.out.println("\nSelect Workout Type");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        System.out.print("Enter choice: ");
        int wChoice=sc.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        int duration=sc.nextInt();

        Workout workout;
        if(wChoice==1){
            workout=new CardioWorkout(duration);
        }else{
            workout=new StrengthWorkout(duration);
        }

        // Workout Tracking 
        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        // Daily Target & Progress 
        System.out.print("\nEnter your daily calorie target: ");
        double dailyTarget=sc.nextDouble();

        double remaining=dailyTarget-workout.getCaloriesBurned();

        // Output 
        System.out.println("\n--- Workout Summary ---");
        workout.showWorkout();

        System.out.println("\nDaily Target: "+dailyTarget);
        System.out.println("Remaining Calories: "+remaining);
    }
}
