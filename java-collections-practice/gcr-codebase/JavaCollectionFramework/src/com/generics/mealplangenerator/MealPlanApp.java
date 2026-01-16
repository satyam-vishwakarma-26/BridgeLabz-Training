package com.generics.mealplangenerator;
import java.util.Scanner;
// Test class for Personalized Meal Plan Generator
public class MealPlanApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n1.Vegetarian\n2.Vegan\n3.Keto\n4.High Protein\n0.Exit");
            System.out.print("Choose meal plan: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Meal<VegetarianMeal> veg=MealUtil.generateMeal(new VegetarianMeal());
                    veg.displayMeal();
                    break;
                case 2:
                    Meal<VeganMeal> vegan=MealUtil.generateMeal(new VeganMeal());
                    vegan.displayMeal();
                    break;
                case 3:
                    Meal<KetoMeal> keto=MealUtil.generateMeal(new KetoMeal());
                    keto.displayMeal();
                    break;
                case 4:
                    Meal<HighProteinMeal> hp=MealUtil.generateMeal(new HighProteinMeal());
                    hp.displayMeal();
                    break;
                case 0:
                    System.out.println("Meal planner closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=0);
        sc.close();
    }
}
