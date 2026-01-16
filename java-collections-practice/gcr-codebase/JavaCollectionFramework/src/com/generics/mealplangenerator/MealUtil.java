package com.generics.mealplangenerator;
// Utility class with generic method
public class MealUtil{
    // Generic method to validate and generate meal plan
    public static <T extends MealPlan> Meal<T> generateMeal(T plan){
        System.out.println("Validating "+plan.getPlanName()+" meal plan");
        return new Meal<>(plan);
    }
}
