package com.generics.mealplangenerator;
// Keto meal plan
public class KetoMeal implements MealPlan{
    public String getPlanName(){
        return "Keto";
    }
    public int getCalories(){
        return 2000;
    }
}
