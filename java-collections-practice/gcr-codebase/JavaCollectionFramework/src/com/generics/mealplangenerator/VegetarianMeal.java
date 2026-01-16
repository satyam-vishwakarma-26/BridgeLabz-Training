package com.generics.mealplangenerator;
// Vegetarian meal plan
public class VegetarianMeal implements MealPlan{
    public String getPlanName(){
        return "Vegetarian";
    }
    public int getCalories(){
        return 1800;
    }
}
