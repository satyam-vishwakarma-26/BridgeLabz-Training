package com.BudgetWise;
import java.util.*;
// Monthly budget implementation
public class MonthlyBudget extends Budget{
    public MonthlyBudget(double income,double limit,HashMap<String,Double> categoryLimits){
        super(income,limit,categoryLimits);
    }
    // Monthly report format
    public void generateReport(){
        System.out.println("Monthly Budget Report");
        System.out.println("Income: "+income);
        System.out.println("Expenses: "+totalExpenses());
        System.out.println("Savings: "+calculateSavings());
    }
    // Detect category overspending
    public void detectOverspend(){
        HashMap<String,Double> spent=new HashMap<>();
        for(Transaction t:transactions){
            spent.put(t.getCategory(),spent.getOrDefault(t.getCategory(),0.0)+t.getAmount());
        }
        for(String cat:spent.keySet()){
            if(spent.get(cat)>categoryLimits.getOrDefault(cat,Double.MAX_VALUE)){
                System.out.println("Overspend detected in "+cat);
            }
        }
    }
}
