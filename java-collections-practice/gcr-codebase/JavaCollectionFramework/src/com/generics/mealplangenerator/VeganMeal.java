package com.generics.mealplangenerator;
// Vegan meal plan
public class VeganMeal implements MealPlan{
    public String getPlanName(){
        return "Vegan";
    }
    public int getCalories(){
        return 1700;
    }
}
