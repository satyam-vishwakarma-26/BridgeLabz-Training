package com.generics.mealplangenerator;
// Generic meal wrapper with bounded type parameter
public class Meal<T extends MealPlan>{
    private T plan;
    public Meal(T plan){
        this.plan=plan;
    }
    public void displayMeal(){
        System.out.println("Meal Plan: "+plan.getPlanName()+" | Calories: "+plan.getCalories());
    }
    public T getPlan(){
        return plan;
    }
}
